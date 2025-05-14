import java.util.Scanner;

public class ptNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int index = sc.nextInt();

        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < index; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array is: " + min);
    }
}
