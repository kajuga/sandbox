package JavaRush;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class CharsetTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] byteArray1 = "abcd".getBytes();
        char[] ch = "abcd".toCharArray();
        byte[] byteArray2 = "efgh".getBytes(StandardCharsets.US_ASCII);
        byte[] byteArray3 = "ijkl".getBytes("UTF-8");


        System.out.println(new String(byteArray1));
        System.out.println(new String(ch));


        printArray(byteArray1);
        System.out.println();
        printArray(byteArray2);



    }

    static void printArray(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }


    public void whenGetBytes_thenCorrect() throws UnsupportedEncodingException {
        byte[] byteArray1 = "abcd".getBytes();
        byte[] byteArray2 = "efgh".getBytes(StandardCharsets.US_ASCII);
        byte[] byteArray3 = "ijkl".getBytes("UTF-8");
        byte[] expected1 = new byte[] { 97, 98, 99, 100 };
        byte[] expected2 = new byte[] { 101, 102, 103, 104 };
        byte[] expected3 = new byte[] { 105, 106, 107, 108 };


    }


}
