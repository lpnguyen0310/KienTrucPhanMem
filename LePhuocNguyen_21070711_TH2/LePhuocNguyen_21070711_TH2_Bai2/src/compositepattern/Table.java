package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Table extends Component {
    private List<Component> products = new ArrayList<>();

    // Thêm sản phẩm vào bàn
    public void addProduct(Component product) {
        products.add(product);
    }

    // Xóa sản phẩm khỏi bàn
    public void removeProduct(Component product) {
        products.remove(product);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component product : products) {
            total += product.getPrice();
        }
        return total;
    }
}
