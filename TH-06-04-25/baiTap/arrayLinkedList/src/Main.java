import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ProductManager manager = new ProductManager();

        do {
            System.out.println("1. Add product");
            System.out.println("2. Edit product by Id");
            System.out.println("3. Delete product by Id");
            System.out.println("4. Show all products");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort product by price ascending");
            System.out.println("7. Sort product by price descending");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter product id: ");
                    String id = sc.nextLine();
                    System.out.println("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(name, price, id));
                    break;
                case 2:
                    System.out.println("Enter product id to edit: ");
                    String idEdit = sc.nextLine();
                    System.out.println("Enter new product name: ");
                    String newName = sc.nextLine();
                    System.out.println("Enter new product price: ");
                    double newPrice = sc.nextDouble();
                    if (manager.editProductById(idEdit, newName, newPrice)) {
                        System.out.println("Product edited successfully!");
                    } else {
                        System.out.println("Invalid product id!");
                    }
                    break;
                case 3:
                    System.out.println("Enter product id to delete: ");
                    String idDelete = sc.nextLine();
                    if (manager.deleteProductById(idDelete)) {
                        System.out.println("Product deleted successfully!");
                    } else {
                        System.out.println("Invalid product id!");
                    }
                    break;
                case 4:
                    manager.showAllProducts();
                    break;
                case 5:
                    System.out.println("Enter product name to search: ");
                    String nameSearch = sc.nextLine();
                    manager.searchProductByName(nameSearch);
                    break;
                case 6:
                    System.out.println("Product sorted by price ascending");
                    manager.sortByPriceAscending();
                    break;
                case 7:
                    System.out.println("Product sorted by price descending");
                    manager.sortByPriceDescending();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        sc.close();
    }
}