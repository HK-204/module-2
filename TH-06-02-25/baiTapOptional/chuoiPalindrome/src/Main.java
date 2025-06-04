public class Main {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        MyStack<Character> stack = new MyStack<>();
        MyQueue<Character> queue = new MyQueue<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
            queue.enqueue(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.dequeue())) {
                return false;
            }
        }
        return true;
    }
}