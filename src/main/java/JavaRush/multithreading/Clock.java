package JavaRush.multithreading;

class Clock implements Runnable {
    private boolean isCancel = false;

    public void cancel()
    {
        this.isCancel = true;
    }
@Override
    public void run()
    {
        while (!this.isCancel)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tik");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        Thread clockThread2 = new Thread(clock);
        clockThread.start();
        clockThread2.start();
//        clock.cancel();

        Thread.sleep(10000);
        clock.cancel();
    }

}

