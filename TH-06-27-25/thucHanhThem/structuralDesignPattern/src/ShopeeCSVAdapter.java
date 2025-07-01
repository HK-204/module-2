import java.util.LinkedList;
import java.util.Queue;

public class ShopeeCSVAdapter implements ProductAdapter{
    private Queue<Product> productQueue = new LinkedList<>();

    @Override
    public void loadData(String csvData) {
        String[] lines = csvData.split("\n");
        for (String line : lines) {
            String[] parts = line.split(",");
            String id = parts[0].trim();
            String name = parts[1].trim();
            double price = Double.parseDouble(parts[2].trim());
            productQueue.add(new Product(id, name, price));
        }
    }

    @Override
    public boolean hasNext() {
        return !productQueue.isEmpty();
    }

    @Override
    public Product getProduct() {
        return productQueue.poll();
    }
}
