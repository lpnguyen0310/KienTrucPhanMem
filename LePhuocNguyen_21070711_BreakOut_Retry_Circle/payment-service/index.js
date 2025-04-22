const express = require("express");
const app = express();
app.use(express.json());

app.post("/pay", (req, res) => {
    setTimeout(() => {
        res.json({ status: "paid" });
    }, 1000); // Giả lập xử lý thanh toán
});

app.listen(3001, () => console.log("Payment Service on port 3001"));
