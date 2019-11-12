package PoluxTasks;

/**
 * Реализуйте алгоритм, определяющий, все ли символы в строке встречаются только один раз.
 * А если при этом запрещено использование дополнительных структур данных?
 * Пробел тоже учитываю!
 */

public class Task_01 {

    public static boolean isOne(String str) {
        boolean checker = true;
        if (!str.isEmpty()) {
            char x;
            for (int i = 0; i < str.length(); i++) {
                x = str.charAt(i);
                for (int j = i + 1; j < str.length(); j++) {
                    if (x == str.charAt(j)) {
                        checker = false;
                    }
                }
            }
        }
        return checker;
    }

    public static void main(String[] args) {
        String test = "qwertyuiop 1234567";
        System.out.println(isOne(test));
    }
}
