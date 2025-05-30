import java.util.LinkedList;
import java.util.Queue;

public class BankSystem {
    private Queue<Customer> queue = new LinkedList<>();
    private final Counter[] counter = new Counter[5];
    private int customerId = 1;

    public BankSystem() {
        for (int i = 0; i < 5; i++) {
            counter[i] = new Counter();
        }
    }

    public void addNewCustomer(int count) {
        for (int i = 0; i < count; i++) {
            queue.add(new Customer(customerId, "Customer " + customerId));
            customerId++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i].getCustomer() == null && !queue.isEmpty()) {
                counter[i].serveCustomer(queue.poll());
            }
        }
    }

    public void serveNextCustomer() {
        for (Counter value : counter) {
            if (!queue.isEmpty() && !value.isBusy()) {
                value.serveCustomer(queue.poll());
            }
        }
    }

    public void finishServingCustomer(int index) {
        if (index >= 0 && index < counter.length) {
            counter[index].finishServing();
        }
    }

    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("No customers found");
        } else {
            for (Customer customer : queue) {
                System.out.println(customer.toString());
            }
        }
    }

    public void counterStatus() {
        for (int i = 0; i < counter.length; i++) {
            System.out.println("Counter " + (i + 1) + ": " + counter[i]);
        }
    }
}
