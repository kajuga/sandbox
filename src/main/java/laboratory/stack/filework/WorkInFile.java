package laboratory.stack.filework;

import java.io.FileNotFoundException;

public class WorkInFile {


    private static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
    private static String fileName = "C://blog/a.txt";

    public static void main(String[] args) throws FileNotFoundException {

        //Запись в файл
        FileWorker.write(fileName, text);

        //Попытка прочитать не существующий файл
        //FileWorker.read("no_file.txt");

        //Чтение файл
        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);

        //Обновление файла
        FileWorker.update(fileName, "This new text");

        //Удаление файла
        FileWorker.delete(fileName);
    }


}
