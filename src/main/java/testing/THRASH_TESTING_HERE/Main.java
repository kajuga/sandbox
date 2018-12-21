package testing.THRASH_TESTING_HERE;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread.sleep(5000);

        System.out.println("Сколько я спал? " + (System.currentTimeMillis() - start));


}
    }