import java.io.*;
class FileDelete {
    public static void main(String[] args) 
    {
        File f = new File("Shriram.txt");
        System.out.println(f.delete() ? "Deleted" : "Not found");
    }
}
