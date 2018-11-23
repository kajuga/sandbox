package JavaRush.multithreading;
import java.util.ArrayList;
import java.util.List;

/*
Один для всех, все - для одного
*/

public class Solution {
    static int capasity = 3;
    static List<Thread> waterList = new ArrayList <>(capasity);

    public static void main(String[] args) throws InterruptedException {
        InitianorStarter();
        Thread.sleep(3000);
        Interruptor();
    }

    static void Interruptor() {
        for (Thread thread: waterList) {
            thread.interrupt();
        }


    }

    static void InitianorStarter() {
        Water water = new Water("water");
        for (int i = 0; i < capasity; i++) {
            waterList.add(new Thread(water, "#" + i));
        }
        for (int i = 0; i < capasity; i++) {
            waterList.get(i).start();
        }
    }
}

    class Water implements Runnable {
    boolean isInterrupt = false;
    String commonResourse;

        public Water(String threadName) {
            this.commonResourse = threadName;
        }

        @Override
    public void run() {
        try {
            while(!isInterrupt) {
                System.out.println("Объект " + commonResourse + " нить - " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}
