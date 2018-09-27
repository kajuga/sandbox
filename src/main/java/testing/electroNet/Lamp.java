package testing.electroNet;

public class Lamp implements Consumer{

    void lampOn() {
        System.out.println("Lamp ON");
    }


    @Override
    public void connected() {
        lampOn();
    }
}
