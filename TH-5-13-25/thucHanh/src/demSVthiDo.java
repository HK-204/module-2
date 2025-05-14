import java.util.Scanner;

public class demSVthiDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student (0 - 30): ");
        int n = sc.nextInt();

        if (n < 0 || n > 30) {
            System.out.println("Invalid number of student");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] < 0 || arr[i] > 10) {
                System.out.println("Invalid score of student");
                return;
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5){
                count++;
            }
        }
        System.out.println("Total number of students pass: " + count);
    }
}
