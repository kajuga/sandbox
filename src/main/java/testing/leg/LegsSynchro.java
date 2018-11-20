package testing.leg;

public class LegsSynchro {
    public static void main(String[] args) throws InterruptedException {
        Leg lg1 =  new Leg("left");
        Leg lg2 =  new Leg("right");

        new Thread(lg1).start();
        new Thread(lg2).start();
//        Thread.sleep(2000);
    }
}