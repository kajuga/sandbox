package testing.test_TaskByPetr;

public class DecoratorDemo {
    public static void main(String[] args) {
        Print simple = new PrinterFirst("HOLA!");
        simple.print();
        System.out.println();

        Print simple2 = new MyDecorator(new PrinterFirst("Coca-Cola"));
        simple2.print();


    }
}

interface Print {
    void print();
}

class PrinterFirst implements Print {
    String value;

    public PrinterFirst(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}


class MyDecorator implements Print {
    Print print;

    public MyDecorator(Print print) {
        this.print = print;
    }

    @Override
    public void print() {
        System.out.print("\"");
        print.print();
        System.out.println("\"");
    }
}
