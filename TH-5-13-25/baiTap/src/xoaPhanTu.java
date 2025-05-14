import java.util.Arrays;
import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 6, 8, 3, 4, 1, 2};
        boolean isExist = false;
        System.out.println("Delete element: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                isExist = true;
                break;
            }
        }
        if (!isExist) System.out.println("Element not exist");
        System.out.println(Arrays.toString(arr));
    }
}
