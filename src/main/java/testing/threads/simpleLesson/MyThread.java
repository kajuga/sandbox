package testing.threads.simpleLesson;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 12000; i++) {
            MainClass.Incrementor();
        }
    }
}
