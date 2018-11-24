package JavaRush.multithreading;
import java.util.ArrayList;
import java.util.List;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());
        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
