public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = rear = null;
    }

    public void enQueue(int value) {
        Node temp = new Node(value);
        if (front == null) {
            front = rear = temp;
            rear.link = front;
        } else {
            rear.link = temp;
            rear = temp;
            rear.link = front;
        }
    }

    public void deQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        do {
            System.out.println(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
    }
}
