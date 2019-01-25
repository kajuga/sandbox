package JavaRush.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        int serverPort = 6666;
        String address = "127.0.0.1";

        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            System.out.println("Настройки клиента: " + address + " port: " + serverPort + "?");;
            Socket socket = new Socket(ipAddress, serverPort);
            System.out.println("Yep? socket is created!");

            InputStream sin = socket.getInputStream();
            OutputStream outs = socket.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(outs);

            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println("Nype something  and press ENTER");
            System.out.println();

            while(true) {
                line = keyboard.readLine();
                System.out.println("Sending this to the server");
                out.writeUTF(line);
                out.flush();
                line = in.readUTF();
                System.out.println("Answer from the server: " + line);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }




}