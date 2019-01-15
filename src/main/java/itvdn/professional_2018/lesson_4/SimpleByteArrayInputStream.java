package itvdn.professional_2018.lesson_4;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[] {1, 3, 5, 7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);


        int tmp;

        while ((tmp = byteArrayInputStream.read()) != -1) {
            System.out.println(tmp);

        }

    }
}
