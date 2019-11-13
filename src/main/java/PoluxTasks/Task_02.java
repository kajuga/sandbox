package PoluxTasks;

/**
 * Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой
 */

public class Task_02 {

     public boolean isSame(String str1, String str2) {
        boolean result = false;
        if (str1.length() == str2.length()) {
            if (counterSummChars(str1) == counterSummChars(str2)) {
                result = true;
            }
        }
        return result;
    }

    public int counterSummChars(String str) {
        int summCounter = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                summCounter += Character.getNumericValue(str.charAt(i));
            }
        }
        return summCounter;
    }
}