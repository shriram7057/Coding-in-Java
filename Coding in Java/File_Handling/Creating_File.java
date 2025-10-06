import java.io.*;
class Creating_File
{
    public static void main(String[] args) throws IOException{
        File f=new File ("Shriram.txt");
        System.out.println(f.createNewFile() ? "File Created":"ALready Exists");
    }
}