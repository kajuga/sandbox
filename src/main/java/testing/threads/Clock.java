package testing.threads;

public class Clock extends Thread {

    public static void main (String[] args) {
        Clock clock = new Clock();
        clock.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clock.interrupt();
    }

    @Override
    public void run() {
        //Thread thread = currentThread();
        while (!isInterrupted()) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Работа потока была прервана");
                break;
            }
            System.out.println("tik");
        }
    }
}