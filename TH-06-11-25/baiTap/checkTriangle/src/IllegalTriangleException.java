import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter three sides: ");
        System.out.println("Enter side a: ");
        double a = sc.nextDouble();
        System.out.println("Enter side b: ");
        double b = sc.nextDouble();
        System.out.println("Enter side c: ");
        double c = sc.nextDouble();
        IllegalTriangleException e = new IllegalTriangleException();
        e.checkTriangle(a, b, c);
    }

    public void checkTriangle(double a, double b, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Please enter a positive number");
            }

            if (!((a + b > c) && (a + c > b) && (b + c > a))) {
                throw new IllegalArgumentException("Invalid sides of triangle");
            }
            System.out.print("This is a triangle");
        } catch (InputMismatchException e) {
            System.err.print("Invalid input, please input a number");
        } catch (IllegalArgumentException e) {
            System.err.print("Error to check triangle: " + e.getMessage());
        } catch (Exception e) {
            System.err.print("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

