import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Life is beautiful when you're smiling";
        System.out.println("Original string: " + input);
        String output = reverseString(input);
        System.out.println("Reversed string: " + output);
    }

    public static String reverseString(String str) {
        Stack<String> stack = new Stack<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
