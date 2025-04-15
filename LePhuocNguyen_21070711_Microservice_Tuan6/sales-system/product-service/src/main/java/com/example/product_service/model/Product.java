package com.example.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entity Sản phẩm đại diện cho thông tin chi tiết sản phẩm.
 * Bao gồm các trường: tên, mô tả, giá và tồn kho.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Định danh duy nhất cho sản phẩm

    private String name; // Tên sản phẩm
    private String description; // Mô tả sản phẩm
    private double price; // Giá sản phẩm
    private int stock; // Số lượng tồn kho của sản phẩm

    // Getters và Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}