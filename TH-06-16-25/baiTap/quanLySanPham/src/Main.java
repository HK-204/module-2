import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add new product");
            System.out.println("2. Show all products");
            System.out.println("3. Find product by ID");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    foundProduct();
                    break;
                case 0:
                    System.out.println("Goodbye!");
            }
        } while (choice != 0);
        sc.close();
    }

    public static void addProduct() {
        List<Product> list = new ArrayList<>();

        File file = new File("products.dat");
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<Product>) ois.readObject();
            } catch (Exception e) {
                System.err.println("Can't read file, start with empty list");
            }
        }

        String newId = InputUtils.inputNumber("Enter new id: ", s -> {
            if (!s.matches("\\d+")) {
                throw new IllegalArgumentException("Id must be numeric");
            }
            return s;
        });

        boolean exists = list.stream().anyMatch(p -> p.getId().equalsIgnoreCase(newId));
        if (exists) {
            System.out.println("Product already exists");
            return;
        }
        sc.nextLine();

        System.out.print("Enter new name: ");
        String newName = sc.nextLine();
        double newPrice = InputUtils.inputNumber("Enter new price: ", Double::parseDouble);
        System.out.print("Enter new brand: ");
        String newBrand = sc.nextLine();
        System.out.print("Enter new description: ");
        String newDescription = sc.nextLine();
        Product p = new Product(newId, newName, newPrice, newBrand, newDescription);
        list.add(p);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.dat"))) {
            oos.writeObject(list);
            System.out.println("Product added");
        } catch (Exception e) {
            System.err.println("Can't add product");
            e.printStackTrace();
        }
    }

    public static void showList() {
        List<Product> list = new ArrayList<>();
        File file = new File("products.dat");
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<Product>) ois.readObject();
            } catch (Exception e) {
                System.err.println("Can't read file");
                e.printStackTrace();
            }
        } else {
            System.err.println("File not found or empty");
            return;
        }

        if (list.isEmpty()) {
            System.out.println("No products found");
        } else {
            list.forEach(System.out::println);
        }
    }

    public static void foundProduct() {
        List<Product> list = new ArrayList<>();
        File file = new File("products.dat");
        if (file.exists() && file.length() > 0) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                list = (List<Product>) ois.readObject();
            } catch (Exception e) {
                System.err.println("Can't read file");
                e.printStackTrace();
            }
        } else {
            System.err.println("File not found or empty");
            return;
        }

        if (list.isEmpty()) {
            System.out.println("No products found");
            return;
        }

        String id = InputUtils.inputNumber("Enter product id: ", s -> {
            if (!s.matches("\\d+")) {
                throw new IllegalArgumentException("Id must be numeric");
            }
            return s;
        });

        list.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findFirst()
                .ifPresentOrElse(
                        p -> {
                            System.out.println("Product found");
                            System.out.println(p);
                        },
                        () -> System.out.println("Product not found")
                );
    }
}