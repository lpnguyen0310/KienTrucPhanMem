const express = require("express");
const app = express();
app.use(express.json());

app.post("/ship", (req, res) => {
    setTimeout(() => {
        res.json({ status: "shipped", orderId: req.body.orderId });
    }, 1000); // Giả lập xử lý giao hàng
});

app.listen(3003, () => console.log("Shipping Service on port 3003"));
