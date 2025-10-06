import java.io.*;
class File_ex2 {
    public static void main(String[] args) throws Exception 
    {
        File f = new File("testFile1.txt");
        f.createNewFile();
        System.out.println(f.getCanonicalFile() + " Exists? " + f.exists());
    }
}
