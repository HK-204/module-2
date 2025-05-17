import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        while (true) {
            System.out.println("Enter coefficient a (a different 0): ");
            a = sc.nextDouble();
            if (a != 0) {
                break;
            }
            System.out.println("a must be different 0. ");
        }
        System.out.println("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = sc.nextDouble();

        quadraticEquation equation = new quadraticEquation(a, b, c);
        equation.solve();
        sc.close();
    }
}