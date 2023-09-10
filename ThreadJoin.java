class WorkerThread extends Thread {
    public void run() {
        System.out.println("WorkerThread is running.");
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread();
        WorkerThread thread2 = new WorkerThread();

        thread1.start();

        try {
            thread1.join(); // Wait for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}
