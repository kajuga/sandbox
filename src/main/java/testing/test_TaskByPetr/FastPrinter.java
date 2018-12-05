package testing.test_TaskByPetr;

public class FastPrinter {
    public static void main(String[] args) {
        PrintInterface printInterface = new Printer("Hellio");
        printInterface.print();

    }

}

interface PrintInterface {
    void print ();
}

class Printer implements PrintInterface {
String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println(message);
    }
}