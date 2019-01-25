package JavaRush.socket;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) {

        int  port = 6666;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("Server waiting for a client...");

            Socket socket = ss.accept();
            System.out.println("Server got a client :))...");
            System.out.println();

            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();


            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            String line = null;

            while (true) {
                line = in.readUTF();
                System.out.println("The dumb client sent me this line" + line);
                System.out.println("I'm sending it back...");
                out.writeUTF(line + " back!");
                out.flush();
                System.out.println("Waiting for a next line...");
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
