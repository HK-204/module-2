package Product;

public abstract class Product {
    private String name;
    private double originalPrice;

    public Product() {}

    public Product(String name, double originalPrice) {
        this.name = name;
        this.originalPrice = originalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public abstract double shippingFee();

    public double finalPrice() {
        return originalPrice + shippingFee();
    }

    @Override
    public String toString() {
        return "Product " + getName() + " have original price is " + getOriginalPrice();
    }
}
