import java.io.*;
import java.net.*;

public class Client 
{
    public static void main(String[] args) throws Exception 
    {
        Socket s = new Socket("localhost", 1212);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String msg = "";
        while (!msg.equalsIgnoreCase("exit")) {
            System.out.print("Client: ");
            msg = br.readLine();
            dos.writeUTF(msg);
            dos.flush();
            System.out.println("Server: " + dis.readUTF());
        }
        dis.close(); dos.close(); s.close();
    }
}
