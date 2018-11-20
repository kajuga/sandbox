package javagr8.waitingRight;

class Produser extends Thread{
    Product p;
    int count;

    Produser(Product p, int count) {
        this.p = p;
        this.count = count;
    }

    public void run() {
        for(int i = 1; i < count + 1; i++) {
            p.setIdProduct(i);
        }
    }
}