package javagr8.threads;

/**
 * Threads demonstration
 */

public class Dispatcher {

    public static void main(String[] args) throws InterruptedException {

        Thread myThread = Thread.currentThread();
        System.out.println(myThread.getName());
        myThread.setName("MyThread");
        //получить имя
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        //выставляю приоритет от 1 до 10
        myThread.setPriority(9);
        System.out.println(myThread.getPriority());
        //проверем живой или нет
        System.out.println(myThread.isAlive());
        Thread other = new Thread(new OtherThread());
        other.start();
        // seeping
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("i= " + i);
            if(i == 2) {
                other.join();
            }
        }
    }
}
class OtherThread implements Runnable{

    public void run() {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(2000);
                System.out.println("j= " + j);
            } catch (InterruptedException e){

            }
        }
    }


}



