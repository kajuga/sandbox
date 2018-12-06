package udemy.threads;

import java.util.Random;

public class InterruptedExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 1000_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was iterrupted");
                    break;
                }
                Math.sin(random.nextInt());
            }
        });

        System.out.println("Starting thread");
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        thread.join();

        System.out.println("Thread is interrupted");
    }
}
