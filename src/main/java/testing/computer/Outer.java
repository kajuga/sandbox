package testing.computer;

public class Outer {
    // Анонимный класс наследуется от класса Demo
    static Demo demo = new Demo() {
        @Override
        public void show() {
            super.show();
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    public static void main(String[] args) {
        demo.show();
    }
}

class Demo {
    public void show() {
        System.out.println("Метод суперкласса");
    }
}