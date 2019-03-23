package stepic.JAVA_base_course;

/**
 * boxing/unbpxing primitives - вручную
 * примитивы не поддерживабстя коллекциями
 */

public class Boxing_unboxing {

    public static void main(String[] args) {

        int primitive = 0;

        Integer reference = Integer.valueOf(primitive);
        System.out.println(reference);

        int  unboxing = reference.intValue();
        System.out.println(unboxing);

/**
 * Преоббразование в строку/из строки
 */
        int fromString = Integer.parseInt("666");
        System.out.println(fromString);

        String toString = Integer.toString(123);
        System.out.println(toString + "41" + 12);




    }
}
