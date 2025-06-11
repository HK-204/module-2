import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    static Scanner sc = new Scanner(System.in);
    public void run() {
        System.out.println("Enter two sides: ");
        double length = 0, width = 0;
        try {
            System.out.println("Enter length: ");
            length = sc.nextDouble();
            System.out.println("Enter width: ");
            width = sc.nextDouble();
            Rectangle e = new Rectangle();
            e.calculateArea(length, width);
        } catch (InputMismatchException e) {
            System.err.print("Invalid input, please input a number");
        } catch (Exception e) {
            System.err.print("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public void calculateArea(double length, double width) {
        double area = 0;
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Please enter a positive number");
        }

        area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
