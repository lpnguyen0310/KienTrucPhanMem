const timeoutMiddleware = (req, res, next) => {
    res.setTimeout(5000, () => {
        console.log('Request timed out');
        res.status(408).send('Request timed out');
    });
    next();
};

module.exports = timeoutMiddleware;
