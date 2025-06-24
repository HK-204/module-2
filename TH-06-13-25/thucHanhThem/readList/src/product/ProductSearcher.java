package product;

import product.checkFile.LoadProducts;

import java.util.List;

public class ProductSearcher extends Thread {
    public static void searchByName(String keyword) {
        keyword = keyword.toLowerCase();
        List<Product> products = LoadProducts.loadProducts();

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

    @Override
    public void run() {
        System.out.println("Searching product... ");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Searching product complete.");
    }
}
