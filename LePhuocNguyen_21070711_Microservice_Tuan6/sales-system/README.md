# Hệ thống Quản lý Bán Hàng - Microservices

Đây là hệ thống quản lý bán hàng đơn giản dựa trên kiến trúc Microservices.

## Kiến trúc hệ thống

Hệ thống bao gồm:

1. **API Gateway** (cổng 8080): Điểm truy cập duy nhất cho client.
2. **Product Service** (cổng 8081): Quản lý sản phẩm (tên, giá, mô tả, tồn kho).
3. **Order Service** (cổng 8082): Quản lý đơn hàng.
4. **Customer Service** (cổng 8083): Quản lý khách hàng.

Mỗi service có database PostgreSQL riêng.

## Công nghệ sử dụng

- Spring Boot, Spring Cloud Gateway
- PostgreSQL
- Docker & Docker Compose
- REST API

## Chạy hệ thống

### Yêu cầu

- Java 17+
- Maven
- Docker & Docker Compose

### Các bước

1. Build service:
```bash
mvn clean package -DskipTests
```

2. Chạy với Docker:
```bash
docker-compose up -d
```

## API Endpoints

### Product Service
- `POST /api/products`: Tạo sản phẩm
- `GET /api/products`: Lấy danh sách sản phẩm
- `GET /api/products/{id}`: Lấy thông tin sản phẩm
- `PUT /api/products/{id}`: Cập nhật sản phẩm
- `DELETE /api/products/{id}`: Xóa sản phẩm

### Order Service
- `POST /api/orders`: Tạo đơn hàng
- `GET /api/orders`: Lấy danh sách đơn hàng
- `GET /api/orders/{id}`: Lấy thông tin đơn hàng
- `PUT /api/orders/{id}`: Cập nhật đơn hàng
- `DELETE /api/orders/{id}`: Hủy đơn hàng

### Customer Service
- `POST /api/customers`: Tạo khách hàng
- `GET /api/customers`: Lấy danh sách khách hàng
- `GET /api/customers/{id}`: Lấy thông tin khách hàng
- `PUT /api/customers/{id}`: Cập nhật khách hàng
- `DELETE /api/customers/{id}`: Xóa khách hàng 