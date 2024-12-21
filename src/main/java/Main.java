public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new ThreadsInterruptionTask();
        Thread t = Thread.startVirtualThread(r);
        Thread.sleep(100);
        t.interrupt();
    }
}
