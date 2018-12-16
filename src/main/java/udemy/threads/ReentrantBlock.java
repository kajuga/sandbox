package udemy.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author Aleksandr Fedorov (msg2fedorov@gmail.com)
 * Reentrant blocker simple tack
 *
 */
public class ReentrantBlock {
    public static void main(String[] args) throws InterruptedException {
        CountStore countStore = new CountStore();

        Thread thread1 = new Thread(countStore::threadOne);

        Thread thread2 = new Thread(() -> countStore.threadTwo());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        countStore.showCounter();
    }
}

class CountStore {
    private int counter;
    private Lock locker = new ReentrantLock();

    private void incrementor() {
        for (int i = 0; i < 20000; i++) {
           counter++;
        }
    }

    public void threadOne() {
        locker.lock();
        incrementor();
        locker.unlock();
    }

    public void threadTwo() {
        locker.lock();
        incrementor();
        locker.unlock();
    }

    public void showCounter() {
        System.out.println(counter);
    }
}