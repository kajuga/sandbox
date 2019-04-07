package stepic.JAVA_base_course;
/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
Метод getCallerClassAndMethodName() должен возвращать имя класса и метода,
откуда вызван метод, вызвавший данный утилитный метод.
Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
является точкой входа в программу, т.е. его никто не вызывал.
Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе
надо выводить класс и метод, откуда сообщение было залогировано.
 */

public class Test_4_1_2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        anotherMethod2();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod2() {
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ste = new Exception().getStackTrace();
        if (ste.length < 3) {
            return null;
        }
        return ste[2].getClassName() + "#" + ste[2].getMethodName();
    }
}