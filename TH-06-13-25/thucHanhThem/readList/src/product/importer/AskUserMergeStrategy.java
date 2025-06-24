package product.importer;

import product.Product;

import java.util.Scanner;

    public class AskUserMergeStrategy implements ProductMergeStrategy{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public boolean shouldReplace(Product existing, Product incoming) {
        System.out.printf("Product with ID %s already exists. Replace it? (y/n): ", existing.getId());
        String choice = scanner.nextLine().trim().toLowerCase();
        return choice.equals("y");
    }
}
