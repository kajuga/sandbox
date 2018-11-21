package testing.eggVoice;

class ChickenVoice extends Thread {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            try{
                Thread.sleep(1000);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

            System.out.println("курица!");
        }
        //Слово «яйцо» сказано 5 раз
    }
}