package testing.threads;

import static java.lang.Thread.sleep;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("Запустился поток " + getName());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Поток " + getName() + " завершил работу");
    }
}

class Main {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();

        thread1.start();
        try {
            thread1.join();
            thread1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Оба потока завершены");









    }



}