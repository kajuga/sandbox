package PoluxTasks;

/**
 * Напишите метод, заменяющий все пробелы в строке символами '%20 '.
 * Можете считать, что длина строки позволяет сохранить дополнительные символы,
 * а фактическая длина строки известна заранее.
 * (Примечание: при реализации метода на java для выполнения операции «на месте» используйте символьный массив.)
 */

public class Task_03 {

    public String whitespaseChanger(String str) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                builder.append("%20 ");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    public String whitespaceChangerVarTwo(String str) {
        return str.replaceAll(" ", "%20 ");
    }
}
