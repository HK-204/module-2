import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double USD = sc.nextDouble();

        double VND = USD * 25000;
        System.out.println("Your VND: " + VND);
    }
}
