package product.importer;

import product.Product;

public interface ProductMergeStrategy {
    boolean shouldReplace(Product existing, Product incoming);
}
