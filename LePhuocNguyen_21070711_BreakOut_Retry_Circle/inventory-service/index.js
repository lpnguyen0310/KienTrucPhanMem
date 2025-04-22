const express = require("express");
const app = express();
app.use(express.json()); // Đảm bảo body-parser hoạt động

// Endpoint để "reserve" hàng hóa (giả lập)
app.post("/reserve", (req, res) => {
    // Kiểm tra xem orderId có được gửi đúng không
    if (!req.body || !req.body.orderId) {
        return res.status(400).json({ error: "orderId is required" });
    }

    // Giả lập việc xử lý đặt hàng
    setTimeout(() => {
        res.json({ status: "reserved", orderId: req.body.orderId });
    }, 1000); // Giả lập thời gian xử lý là 1 giây
});

// Lắng nghe cổng 3002
app.listen(3002, () => console.log("Inventory Service on port 3002"));
