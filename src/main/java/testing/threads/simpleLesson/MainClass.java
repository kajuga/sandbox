package testing.threads.simpleLesson;

public class MainClass {
    static volatile int counter;
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(counter);


    }

//    public synchronized static void Incrementor() {
    public static void Incrementor() {
        counter++;
    }

}
