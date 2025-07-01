import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvData = "001, Bag, 250000\n002, Shoes, 400000";
        ProductAdapter adapter = new ShopeeCSVAdapter();
        adapter.loadData(csvData);

        while (adapter.hasNext()) {
            Product product = adapter.getProduct();
            product.display();
        }

        System.out.println();

        ProductManagerFacade manager = new ProductManagerFacade();

        Product product1 = new Product("001", "Table", 350000);
        manager.addProduct(product1);

        manager.removeProduct("001");

        System.out.println();

        ProductAccess access1 = new ProxyProductAccess("aff001");
        access1.viewProduct("123");

        ProductAccess access2 = new ProxyProductAccess("invalidAff");
        access2.viewProduct("456");
    }
}