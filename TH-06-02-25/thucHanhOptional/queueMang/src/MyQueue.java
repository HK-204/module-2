public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            System.out.println("Enqueuing " + item);
            currentSize++;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeueing " + queueArr[head]);
            head = (head + 1) % capacity;
            currentSize--;
        }
    }
}
