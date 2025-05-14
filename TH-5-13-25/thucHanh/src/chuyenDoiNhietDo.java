import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Fahrenheit to Celsius");
                double fahrenheit = sc.nextDouble();
                System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Celsius to Fahrenheit");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit is: " + celsiusToFahrenheit(celsius));
                break;
            case 0:
                System.exit(0);
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
