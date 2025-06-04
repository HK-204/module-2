import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> queue = new LinkedList<>();

    public void enqueue(E e) {
        queue.addLast(e);
    }

    public E dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
