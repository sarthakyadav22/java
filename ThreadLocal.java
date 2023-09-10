class SharedResource {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static int get() {
        return threadLocal.get();
    }

    public static void increment() {
        threadLocal.set(threadLocal.get() + 1);
    }
}

public class ThreadLocalExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                SharedResource.increment();
                System.out.println(Thread.currentThread().getName() + ": " + SharedResource.get());
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
