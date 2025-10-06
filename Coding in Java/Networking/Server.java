import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1212);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg = "";
        while (!msg.equalsIgnoreCase("exit")) {
            System.out.println("Client: " + dis.readUTF());
            System.out.print("Server: ");
            msg = br.readLine();
            dos.writeUTF(msg);
            dos.flush();
        }
        dis.close(); dos.close(); s.close(); ss.close();
    }
}
