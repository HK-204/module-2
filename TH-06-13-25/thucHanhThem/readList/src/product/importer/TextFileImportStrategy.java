package product.importer;

import product.Product;
import product.checkFile.reader.ReadFromTextFile;

import java.util.List;

public class TextFileImportStrategy implements ProductImportStrategy{
    @Override
    public List<Product> importFrom(String fileName, List<Product> existing) {
        return ReadFromTextFile.readFromTextFile(fileName);
    }
}
