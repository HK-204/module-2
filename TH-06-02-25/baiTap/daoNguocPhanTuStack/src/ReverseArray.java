import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Before reverse array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        reverseArray(numbers);
        System.out.println("\nAfter reverse array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int value : arr) {
            stack.push(value);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
}
