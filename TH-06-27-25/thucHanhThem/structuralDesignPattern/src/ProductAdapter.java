import java.util.List;

public interface ProductAdapter {
    void loadData(String rawData);
    boolean hasNext();
    Product getProduct();
}
