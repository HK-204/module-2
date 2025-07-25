import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int n = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + n + " là " + arr[n]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
