package testing.eggVoice;

public class Dispatcher {
    public static void main(String[] args) {

        Thread egg = new EggVoice();	//Создание потока
        Thread chicken = new ChickenVoice();	//Создание потока

        System.out.println("Спор начат...");
        egg.start(); 			//Запуск потока
        chicken.start();

        if(egg.isAlive())	//Если оппонент еще не сказал последнее слово
        {
            try{
                egg.join();	//Подождать пока оппонент закончит высказываться.
            }catch(InterruptedException e){}

            System.out.println("Первым появилось яйцо!");
        }
        else	//если оппонент уже закончил высказываться
        {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор закончен!");
    }
}
