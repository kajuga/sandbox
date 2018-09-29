package testing.electroNet;

public class Lamp implements Consumer{

    void lampOn() {
        System.out.println("Lamp ON");
    }


    public void connected(Object sender) {
        lampOn();
    }
}
