package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Table> tables = new ArrayList<>();

    // Thêm bàn vào quán cà phê
    public void addTable(Table table) {
        tables.add(table);
    }

    // Tính tổng doanh thu từ tất cả các bàn trong quán
    public double getTotalRevenue() {
        double totalRevenue = 0;
        for (Table table : tables) {
            totalRevenue += table.getPrice();
        }
        return totalRevenue;
    }
}
