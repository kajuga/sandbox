package testing.electroNet;

public class Program {

    public static void main(String[] args) {

        PowerOn powerOn = new PowerOn();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        powerOn.consumersAdder(lamp);
        powerOn.consumersAdder(radio);
        powerOn.electrisityON();

    }
}
