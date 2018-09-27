package testing.electroNet;

public class Radio implements Consumer{

    void radioOn(){
        System.out.println("Radio ON");
    }

    @Override
    public void connected() {
        radioOn();
    }
}
