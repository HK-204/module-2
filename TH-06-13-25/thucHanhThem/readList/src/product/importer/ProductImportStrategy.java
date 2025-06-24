package product.importer;

import product.Product;

import java.util.List;

public interface ProductImportStrategy {
    List<Product> importFrom(String fileName, List<Product> existing);
}
