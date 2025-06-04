import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final HashMap<String, Contact> contacts = new HashMap<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Add contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Find contact");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0);

        sc.close();
    }

    public static void addContact() {
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (contacts.containsKey(phone)) {
            System.out.println("Contact already exists, do you want to overwrite? (y/n)");
            String overwrite = sc.nextLine();
            if (!overwrite.equals("y")) {
                return;
            }
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        contacts.put(phone, new Contact(name, email));
        System.out.println("Contact successfully saved");
    }

    public static void editContact() {
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (!contacts.containsKey(phone)) {
            System.out.println("Contact does not exist");
            return;
        }

        Contact contact = contacts.get(phone);
        System.out.print("Enter new name (press Enter to keep " + contact.getName() + ") : ");
        String newName = sc.nextLine();
        if (!newName.isEmpty()) {
            contact.setName(newName);
        }

        System.out.print("Enter new email (press Enter to keep " + contact.getEmail() + ") : ");
        String newEmail = sc.nextLine();
        if (!newEmail.isEmpty()) {
            contact.setEmail(newEmail);
        }
        System.out.println("Contact successfully updated");
    }

    public static void removeContact() {
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (contacts.remove(phone) != null) {
            System.out.println("Contact successfully removed");
        } else {
            System.out.println("Contact does not exist");
        }
    }

    public static void findContact() {
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase().trim();

        boolean found = false;
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            String phone = entry.getKey();
            Contact contact = entry.getValue();

            if (phone.contains(keyword) ||
                contact.getName().toLowerCase().contains(keyword) ||
                contact.getEmail().toLowerCase().contains(keyword)) {
                System.out.println("Contact found: " + phone + " - " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Contact not found");
        }
    }
}