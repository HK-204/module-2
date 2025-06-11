import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        double radius = 0;
        try {
            System.out.println("Enter radius: ");
            radius = sc.nextDouble();
            Circle e = new Circle();
            e.calculateArea(radius);
        } catch (InputMismatchException e) {
            System.err.print("Invalid input, please input a number");
        } catch (Exception e) {
            System.err.print("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void calculateArea(double radius) {
        double area = 0;
        if (radius <= 0 || radius > 100) {
            throw new IllegalArgumentException("Please enter a positive number, and must be less than 100");
        }

        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
    }
}
