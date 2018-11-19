package javagr8.synchronization;

public class Ticket {
    boolean isBought;
    int place;

    Ticket(int i) {
        this.place = i;
    }

    synchronized void buy(Cashier c) {
        if(!isBought) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
                isBought = true;
                System.out.println("Cashier " + c.id + " ticket " + this.place);
            }
        }
    }