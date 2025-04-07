# Thay đổi Node.js lên phiên bản 16 hoặc mới hơn
FROM node:16

# Tạo thư mục ứng dụng trong container
WORKDIR /usr/src/app

# Sao chép tệp package.json và package-lock.json (nếu có) vào container
COPY package*.json ./

# Cài đặt các phụ thuộc của ứng dụng
RUN npm install

# Sao chép mã nguồn của ứng dụng vào container
COPY . .

# Expose port mà ứng dụng sẽ lắng nghe
EXPOSE 3000

# Chạy ứng dụng khi container được khởi động
CMD ["node", "app.js"]
