import java.io.*;
class File_Descriptor {
    public static void main(String[] args) throws IOException {
        byte[] b = {48,49,50,51,52,53,54,55,56,57,58};
        try (FileOutputStream fos = new FileOutputStream("Record.txt");
             FileInputStream fis = new FileInputStream("Record.txt")) 
             {
            FileDescriptor fd = fos.getFD();
            fos.write(b); fos.flush(); fd.sync();
            int value;
            while ((value = fis.read()) != -1) System.out.print((char)value);
        }
        System.out.println("\nSync() successfully executed!!");
    }
}
