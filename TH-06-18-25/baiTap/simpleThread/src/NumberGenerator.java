public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Generator name: " + Thread.currentThread().getName() +
                                " current number: " + i +
                                " hash code: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished");
    }
}
