public class Main {
    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String expression3 = "s * (s – a) * (s – b * (s – c)";
        String expression4 = "s * (s – a) * s – b) * (s – c)";
        String expression5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(expression1 + " is " + checkParenthesis(expression1));
        System.out.println(expression2 + " is " + checkParenthesis(expression2));
        System.out.println(expression3 + " is " + checkParenthesis(expression3));
        System.out.println(expression4 + " is " + checkParenthesis(expression4));
        System.out.println(expression5 + " is " + checkParenthesis(expression5));
    }

    public static boolean checkParenthesis(String expression) {
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}