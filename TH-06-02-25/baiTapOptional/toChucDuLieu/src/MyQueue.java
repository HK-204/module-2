import java.util.LinkedList;
import java.util.List;

public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e) {
        list.addLast(e);
    }

    public List<E> toList() {
        return new LinkedList<>(list);
    }
}
