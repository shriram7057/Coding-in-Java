import java.io.*;
class File_Writer_Class {
    public static void main(String[] args) throws IOException {
        String txt = "Welcome to TpointTech\nHello World!\nWELCOME";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Path: ");
        FileWriter fw = new FileWriter(br.readLine());
        fw.write(txt);
        fw.close();
        System.out.println(txt);
    }
}
