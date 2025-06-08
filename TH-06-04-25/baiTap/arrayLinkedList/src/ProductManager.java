import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean editProductById(String id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProductById(String id) {
        for (Product product : products) {
            if (product.getId().equalsIgnoreCase(id)) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public void showAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
