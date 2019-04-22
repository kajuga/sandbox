package JavaRush.inheritance.catz_animal;

public class Cat extends Animal {

    static int catsCount = 37;
    String tail = "Изначальное значение tail в классе Cat";

    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("Конструктор класса Cat начал работу (конструктор Animal уже был выполнен)");
        System.out.println("Текущее значение статической переменной catsCount = " + catsCount);
        System.out.println("Текущее значение tail = " + this.tail);
        this.tail = tail;
        System.out.println("Текущее значение tail = " + this.tail);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
    }
}