import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<E> {
    private LinkedList<E> stack = new LinkedList<>();

    public void push(E e) {
        stack.addFirst(e);
    }

    public E pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
