package menu;

import product.*;
import product.checkFile.LoadProducts;
import product.checkFile.writer.WriteToBinaryFile;
import product.checkFile.writer.WriteToTextFile;
import product.importer.ImportProductsFromFile;

import java.util.List;
import java.util.Scanner;

public class MenuHandler {
    private static final Scanner sc = new Scanner(System.in);

    public static void start() {
        int choice;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Products list");
            System.out.println("2. Add product");
            System.out.println("3. Show products with price greater than 1000000");
            System.out.println("4. Edit product price by id");
            System.out.println("5. Search product by name");
            System.out.println("6. Remove product by id");
            System.out.println("7. Import data from another file");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Command showListCommand = new ShowProductListCommand();
                    showListCommand.execute();
                    break;

                case 2:
                    Product product = ProductInputHandler.getProductFromUser();
                    if (product != null) {
                        Command addCommand = new AddProductCommand(product);
                        addCommand.execute();
                    }
                    break;

                case 3:
                    Command showPriceGreaterThan1000000Command = new ShowProductsHavePriceGreaterThan1000000Command();
                    showPriceGreaterThan1000000Command.execute();
                    break;

                case 4:
                    EditProductPriceById.editProductPriceById();
                    break;

                case 5:
                    System.out.println("Enter keyword to search for product: ");
                    String keyword = sc.nextLine();
                    ProductSearcher.searchByName(keyword);
                    break;

                case 6:
                    System.out.println("Enter id to remove product: ");
                    String id = sc.nextLine();
                    ProductRemover.removeById(id);
                    break;

                case 7:
                    System.out.print("Enter file name to import (.txt or .dat): ");
                    String fileName = sc.nextLine();
                    List<Product> loadedList = LoadProducts.loadProducts();
                    ImportProductsFromFile.execute(loadedList, fileName);
                    WriteToTextFile.writeToTextFile(loadedList, "products.txt");
                    WriteToBinaryFile.writeToBinaryFile(loadedList, "products.dat");
                    System.out.println("Import completed.");
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
