import java.util.Scanner;

public class timMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20) System.out.println("Maximum number is 20.");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element at index " + i + ": ");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }

        System.out.println("\nMaximum number is " + max + " at position " + index);

    }
}
