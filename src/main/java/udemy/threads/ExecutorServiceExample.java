package udemy.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Fedorov Aleksandr (msg2fedorov@gmail.com)
 * ExecutorService simple realisation
 */
public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException {
        Work work = new Work();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 2; i++) {
            executorService.submit(new Thread(work::workFirst));
            executorService.submit(new Thread(() -> work.workFirst()));

            executorService.shutdown();
            System.out.println("All tasks submitted");
            work.showCounter();
            executorService.awaitTermination(2, TimeUnit.SECONDS);
        }
    }
}

class Work {
    private volatile int counter;
    Lock locker = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            counter++;
        }
    }

    public void workFirst() {
        locker.lock();
        increment();
        locker.unlock();
    }

    public void workSecond() {
        locker.lock();
        increment();
        locker.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}