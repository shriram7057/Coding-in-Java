import java.io.*;
class Buffer_Writer {
    public static void main(String[] args) throws IOException {
        String txt = "Welcome to TpointTech\nHello World!\nWELCOME";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Path: ");
        BufferedWriter bw = new BufferedWriter(new FileWriter(br.readLine()));
        bw.write(txt);
        bw.close();
        System.out.println(txt);
    }
}
