package stepic.JAVA_base_course;
/*
Выберите выражения, которые дадут в качестве результата строку A12.
Тест — Выберите один или несколько вариантов из списка
 "A" + ('\t' + '\u0003')
 'A' + '1' + "2"
 'A' + "12"
 "A" + 12
 */


public class Array_String_testing {
    public static void main(String[] args) {
        String result = "A" + ('\t' + '\u0003');
        String result2 = 'A' + '1' + "2";
        String result3 = 'A' + "12";
        String result4 = "A" + 12;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

}
