package product.importer;

import product.Product;
import product.checkFile.reader.ReadFromBinaryFile;

import java.util.List;

public class BinaryFileImportStrategy implements ProductImportStrategy{
    @Override
    public List<Product> importFrom(String fileName, List<Product> existing) {
        return ReadFromBinaryFile.readFromBinaryFile(fileName);
    }
}
