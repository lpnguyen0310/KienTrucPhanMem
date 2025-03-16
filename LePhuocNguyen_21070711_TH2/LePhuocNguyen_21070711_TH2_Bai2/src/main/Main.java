package main;

import compositepattern.CoffeeShop;
import compositepattern.Product;
import compositepattern.Table;

public class Main {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product coffee = new Product("Cà phê", 30.0);
        Product tea = new Product("Trà sữa", 25.0);
        Product water = new Product("Nước suối", 10.0);

        // Tạo các bàn
        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);

        Table table2 = new Table();
        table2.addProduct(tea);
        table2.addProduct(water);

        // Tạo quán cà phê và thêm bàn vào quán
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        // In ra tổng doanh thu của quán
        System.out.println("Doanh thu của quán cà phê là: " + coffeeShop.getTotalRevenue() + " VNĐ");
    }
}
