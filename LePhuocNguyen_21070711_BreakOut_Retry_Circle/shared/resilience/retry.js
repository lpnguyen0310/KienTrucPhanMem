const axios = require("axios");

const retryRequest = (fn, retries = 3, delay = 1000) => {
  return new Promise((resolve, reject) => {
    const attempt = (count) => {
      fn()
        .then(resolve)
        .catch((err) => {
          if (count <= retries) {
            console.log(`Retry attempt ${count} failed. Retrying...`);
            setTimeout(() => attempt(count + 1), delay);
          } else {
            reject(err);
          }
        });
    };

    attempt(1);
  });
};

module.exports = retryRequest;
