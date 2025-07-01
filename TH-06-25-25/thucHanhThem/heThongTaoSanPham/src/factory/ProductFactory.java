package factory;

import product.*;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "hat":
                return new Hat();
            case "shoe":
                return new Shoe();
            case "shirt":
                return new Shirt();
            default:
                throw new IllegalArgumentException("Invalid product: " + type);
        }
    }
}
