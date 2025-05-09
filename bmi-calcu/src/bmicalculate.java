import java.util.Scanner;

public class bmicalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter weight in kilograms: ");
        weight = scanner.nextDouble();

        System.out.print("Enter height in meters: ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
