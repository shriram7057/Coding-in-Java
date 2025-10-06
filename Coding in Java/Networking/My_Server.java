import java.io.*;
import java.net.*;

public class My_Server {
    public static void main(String[] args) {
        try {
            // Create server socket on port 1212
            ServerSocket ss = new ServerSocket(1212);
            System.out.println("Server is waiting for a client...");

            // Accept client connection
            Socket s = ss.accept();
            System.out.println("Client connected.");

            // Read message from client
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();  // no need for (String) cast
            System.out.println("Message = " + str);

            // Close streams and socket
            dis.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
