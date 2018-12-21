package testing;

public class StaticTest {
    static int xxx;
//инициализация статик блоком на уровне класса
    static {
        xxx = 2;
    }
//инициализация на уровне обхекта - т.е. будет проиницициализирован
// ТОЛЬКО при создании объекта класса, верно?
    public StaticTest() {
        this.xxx = 3;
    }

    //вот тут проверяю, наверное делаю правильно
    public static void main(String[] args) {
        System.out.println(StaticTest.xxx);
        StaticTest st = new StaticTest();
        System.out.println(st.xxx);
    }
}
