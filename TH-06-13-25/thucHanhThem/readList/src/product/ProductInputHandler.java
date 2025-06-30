package product;

import product.checkFile.LoadProducts;

import java.util.List;
import java.util.Scanner;

public class ProductInputHandler {
    private static final Scanner sc = new Scanner(System.in);

    public static Product getProductFromUser() {
        System.out.print("Enter product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        double price;
        while (true) {
            try {
                System.out.print("Enter product price: ");
                String input = sc.nextLine().trim();
                price = Double.parseDouble(input);
                if (CheckValidPrice.checkPrice(price)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid price.");
            }
        }

        return new Product(id, name, price);
    }
}
