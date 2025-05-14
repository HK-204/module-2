import java.util.Arrays;
import java.util.Scanner;

public class chenPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 7, 6, 8, 3, 4, 1};
        System.out.println("Element insert: ");
        int n = sc.nextInt();
        System.out.println("Insert index (0 - " + (arr.length - 1) + "): ");
        int x = sc.nextInt();

        if (x < 0 || x > arr.length){
            System.out.println("Invalid index");
            return;
        }

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < x; i++){
            newArr[i] = arr[i];
        }
        newArr[x] = n;

        for (int i = x; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
