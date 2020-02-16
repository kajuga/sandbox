package MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestExample {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String mePass = "sashoker_Fedoroker_78";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest(mePass.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes
        ) {
            sb.append(String.format("%02X ", b));

        }
        System.out.println(sb.toString());

    }
}
