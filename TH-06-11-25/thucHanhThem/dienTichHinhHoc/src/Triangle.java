import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("Enter two sides: ");
        double base = 0, height = 0;
        try {
            System.out.println("Enter base: ");
            base = sc.nextDouble();
            System.out.println("Enter height: ");
            height = sc.nextDouble();
            Triangle e = new Triangle();
            e.calculateArea(base, height);
        } catch (InputMismatchException e) {
            System.err.print("Invalid input, please input a number");
        } catch (Exception e) {
            System.err.print("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void calculateArea(double base, double height) {
        double area = 0;
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Please enter a positive number");
        }

        area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}
