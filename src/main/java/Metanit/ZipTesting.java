package Metanit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTesting {


    public static void main(String[] args) {


        String filename = "/home/kajuga/projects/sandbox/src/main/java/Metanit/notes.txt";
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("/home/kajuga/projects/sandbox/src/main/java/Metanit/notes.zip"));
        FileInputStream fis = new FileInputStream(filename)) {

            ZipEntry entry1 = new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            //считываю содержимое в массив байт
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            //добавляю содержимое к архиву
            zout.write(buffer);
            //закрываю
            zout.closeEntry();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
