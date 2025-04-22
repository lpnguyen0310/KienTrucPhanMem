const rateLimit = require('express-rate-limit');

// Rate Limiter Client - Giới hạn số lượng request tối đa cho mỗi IP trong 1 phút
const createRateLimiter = rateLimit({
  windowMs: 60 * 1000, // 1 phút
  max: 10, // Giới hạn tối đa 10 yêu cầu
  message: "Too many requests, please try again later.",
  headers: true, // Sử dụng thông tin về rate limit trong headers
});

module.exports = createRateLimiter;
