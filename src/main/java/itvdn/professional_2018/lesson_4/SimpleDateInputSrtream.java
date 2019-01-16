package itvdn.professional_2018.lesson_4;

import java.io.*;

public class SimpleDateInputSrtream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("/home/kajuga/projects/sandbox/src/main/java/itvdn/professional_2018/lesson_4/dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("/home/kajuga/projects/sandbox/src/main/java/itvdn/professional_2018/lesson_4/dataOut.txt")))) {
            out.writeShort(1200);
            out.writeInt(1111);
            out.writeLong(10L);
            out.writeUTF("Hello World!!!");

            out.flush();

            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}














