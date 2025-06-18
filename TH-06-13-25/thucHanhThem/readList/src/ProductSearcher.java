import java.util.List;

public class ProductSearcher {
    public static void searchByName(String keyword) {
        keyword = keyword.toLowerCase();
        List<Product> products = Main.loadProducts();

        boolean found = false;
        System.out.println("Searching for: " + keyword);
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword)) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }
}
