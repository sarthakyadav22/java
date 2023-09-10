class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
