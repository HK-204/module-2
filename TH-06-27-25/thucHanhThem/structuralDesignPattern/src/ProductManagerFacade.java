import java.util.ArrayList;
import java.util.List;

public class ProductManagerFacade {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (validate(product)) {
            products.add(product);
            log("Product added: " + product);
        }
    }

    public void removeProduct(String productId) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.getId().equals(productId)) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            log("Product removed: " + productId);
        }
    }

    private boolean validate(Product product) {
        return product != null && product.getPrice() > 0;
    }

    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
