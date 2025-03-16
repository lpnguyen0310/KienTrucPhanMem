package compositepattern;

public class Product extends Component {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
