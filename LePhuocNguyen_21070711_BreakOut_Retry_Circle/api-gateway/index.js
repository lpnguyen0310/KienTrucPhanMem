const express = require("express");
const axios = require("axios");
const createCircuitBreaker = require("../shared/resilience/circuitBreaker");
const retryRequest = require("../shared/resilience/retry"); // Import retryRequest

const createRateLimiter = require("../shared/resilience/rateLimiter");
const timeoutMiddleware = require("../shared/resilience/timeout");

const app = express();
app.use(express.json());
app.use(createRateLimiter);
app.use(timeoutMiddleware);

// Các dịch vụ mà API Gateway sẽ gọi
const paymentService = (orderId) => axios.post("http://localhost:3001/pay", { orderId }, {
    headers: { 'Content-Type': 'application/json' }
});

const shippingService = (orderId) => axios.post("http://localhost:3003/ship", { orderId }, {
    headers: { 'Content-Type': 'application/json' }
});
const inventoryService = (orderId) => axios.post("http://localhost:3002/reserve", { orderId }, {
    headers: { 'Content-Type': 'application/json' }
});

// Tạo Circuit Breakers cho các dịch vụ
const paymentBreaker = createCircuitBreaker(paymentService);
const inventoryBreaker = createCircuitBreaker(inventoryService);
const shippingBreaker = createCircuitBreaker(shippingService);

// Route để đặt hàng
app.post("/order", async (req, res) => {
    try {
        const orderId = req.body.orderId;
        if (!orderId) {
            return res.status(400).json({ error: "orderId is required" });
        }

        console.log("Received orderId:", orderId);  // In ra orderId từ client

        // Gửi yêu cầu đến các dịch vụ Payment, Inventory, Shipping, mỗi dịch vụ sẽ nhận orderId
        // const payment = await paymentBreaker.fire(orderId); // Gửi orderId cho payment service
        // const inventory = await inventoryBreaker.fire(orderId); // Gửi orderId cho inventory service
        // const shipping = await shippingBreaker.fire(orderId); // Gửi orderId cho shipping service
        const payment = await retryRequest(() => paymentBreaker.fire(orderId)); // Sử dụng retryRequest
        const inventory = await retryRequest(() => inventoryBreaker.fire(orderId)); // Sử dụng retryRequest
        const shipping = await retryRequest(() => shippingBreaker.fire(orderId)); // Sử dụng retryRequest

        // Trả về kết quả từ các dịch vụ
        res.json({
            payment: payment.data,
            inventory: inventory.data,
            shipping: shipping.data,
        });
    } catch (err) {
        console.error("Error details:", err);  // In chi tiết lỗi
        res.status(500).send("Order failed: " + err.message);
    }
});

// Bắt đầu server
app.listen(3000, () => console.log("API Gateway on port 3000"));
