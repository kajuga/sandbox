package javagr8.waitingRight;

class Product{
    int id;
    boolean isProdused;

    synchronized void getIdProduct() {
        if(isProdused != true) {
            System.out.println("..." + isProdused);
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get " + this.id);
        isProdused = false;
        notify();
    }

    synchronized void setIdProduct(int id) {
        if(isProdused) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.id = id;
        System.out.println("Set " + this.id);
        isProdused = true;
        notify();
    }
}