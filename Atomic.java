import java.util.concurrent.atomic.AtomicInteger;

public class Atomic{
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(0);

        Runnable incrementTask = () -> {
            for (int i = 0; i < 10000; i++) {
                atomicInt.incrementAndGet();
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + atomicInt.get());
    }
}
