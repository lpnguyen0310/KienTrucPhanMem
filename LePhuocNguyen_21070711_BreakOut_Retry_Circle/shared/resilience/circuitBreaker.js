const CircuitBreaker = require('opossum');

function createCircuitBreaker(func) {
    const breaker = new CircuitBreaker(func, {
        timeout: 5000, // Timeout trong ms
        errorThresholdPercentage: 50, // Ngưỡng lỗi khi mở circuit (50%)
        resetTimeout: 10000 // Thời gian reset circuit (10s)
    });

    breaker.on('open', () => console.log('Circuit is OPEN'));
    breaker.on('halfOpen', () => console.log('Circuit is HALF-OPEN'));
    breaker.on('close', () => console.log('Circuit is CLOSED'));

    return breaker;
}

module.exports = createCircuitBreaker;
