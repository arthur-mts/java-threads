public class ThreadsInterruptionTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            if (!Thread.currentThread().isInterrupted()) {
                System.out.println("Im a thread and im running");
            } else {
                System.out.println("Im a thread and was interrupted. Exiting...");
                return;
            }
        }
    }
}
