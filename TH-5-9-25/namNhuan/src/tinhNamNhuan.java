import java.util.Scanner;

public class tinhNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        boolean namNhuan = false;

        boolean namChia4 = year % 4 == 0;
        if (namChia4) {
            boolean namChia100 = year % 100 == 0;
            if (namChia100) {
                boolean namChia400 = year % 400 == 0;
                if (namChia400) {
                    namNhuan = true;
                }
            } else {
                namNhuan = true;
            }
        }

        if (namNhuan) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
