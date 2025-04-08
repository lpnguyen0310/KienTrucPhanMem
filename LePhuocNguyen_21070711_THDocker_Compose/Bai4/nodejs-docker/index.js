const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Xin chào từ Node.js và Docker!');
});

const port = 3000;
app.listen(port, () => {
  console.log(`Ứng dụng đang chạy tại http://localhost:${port}`);
});