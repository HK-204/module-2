import java.util.Stack;

public class MyStack<E> {
    private Stack<E> stack = new Stack<>();

    public void push(E e) {
        stack.push(e);
    }

    public E pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
