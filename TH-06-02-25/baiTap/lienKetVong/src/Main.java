public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        System.out.println("Queue before dequeue: ");
        q.displayQueue();

        q.deQueue();
        System.out.println("Queue after dequeue 1 value: ");
        q.displayQueue();

    }
}