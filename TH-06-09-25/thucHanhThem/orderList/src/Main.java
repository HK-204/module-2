import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> list = new ArrayList<>();

        System.out.print("Number of orders: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Order #" + (i + 1) + ": ");
            String order = sc.nextLine();
            System.out.print("Total amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            list.add(new Order(order, amount));
        }

        OrderSorter.bubbleSort(list);

        System.out.println("\nOrder list after sorting: ");
        for (Order order : list) {
            System.out.println(order);
        }

        System.out.println("\nOrder with the largest amount: " + list.get(0));

        System.out.println("\nOrders over 100000: ");
        for (Order order : list) {
            if (order.getTotalAmount() > 100000) {
                System.out.println(order);
            }
        }
    }


}