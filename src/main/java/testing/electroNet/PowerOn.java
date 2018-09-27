package testing.electroNet;

import java.util.ArrayList;
import java.util.List;

public class PowerOn {

    private List<Consumer> consumers = new ArrayList <>();

    void consumersAdder (Consumer consumer) {
        consumers.add(consumer);
    }


    void electrisityON() {
        System.out.println("WARNING!!");
        System.out.println("Сеть подключена к источнику питания");

        if(consumers != null) {
            for (Consumer cons: consumers) {
                cons.connected();
            }
        }
    }
}
