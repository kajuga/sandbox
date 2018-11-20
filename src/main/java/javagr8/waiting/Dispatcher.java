package javagr8.waiting;

public class Dispatcher {
    public static void main(String[] args) {
        Product p = new Product();
        Produser pr = new Produser(p, 5);
        Consumer cons = new Consumer(p, 5);
        pr.start();
        cons.start();
    }
}