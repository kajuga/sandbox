package testing.electroNet;

import java.util.stream.IntStream;

public class Program {

    public static void fire(Object senter) {
        System.out.println("Message!!!");
    }


    public static void main(String[] args) {

        PowerOn powerOn = new PowerOn();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        powerOn.consumersAdder(lamp);
        powerOn.consumersAdder(radio);

//        powerOn.consumersAdder(new Consumer() {
//            @Override
//            public void connected() {
//                System.out.println("Короткое замыкание!!");
//            }
//        }
//        );

        powerOn.consumersAdder(x -> System.out.println("БАБАХ")) ;
//        powerOn.consumersAdder(sender -> Program.fire(sender)) ;
//        powerOn.consumersAdder(Program :: fire) ;

        int x = 3;
        int y = 7;

        IntStream.range(x, y).reduce(1, (prevRes,current) -> prevRes*current);
        powerOn.electrisityON();

    }
}
