import java.io.*;
class File_Ex1 {
    public static void main(String[] args) throws IOException 
    {
        File f = new File("javaFile123.txt");
        System.out.println(f.createNewFile() ? "New File created!" : "File already exists.");
    }
}
