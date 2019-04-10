package testing.TimeMachine;

public class TimeMachine {

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();

        Cat barsik = new Cat(5);

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("Барсик отправился в будущее! Его возраст изменился?");
        System.out.println(barsik.age);

        System.out.println("А если попробовать в прошлое?");
        timeMachine.goToPast(barsik);
        System.out.println(barsik.age);
    }

    public void goToFuture(Cat cat) {

        cat = new Cat(cat.age);
        cat.age += 10;
    }

    public void goToPast(Cat cat) {

        cat = new Cat(cat.age);
        cat.age -= 10;
    }
}