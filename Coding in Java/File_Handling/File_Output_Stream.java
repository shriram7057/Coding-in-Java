import java.io.*;
import java.util.*;
class CreateFileExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("File name: ");  
        String name = sc.nextLine();
        System.out.print("Content: ");  
        new FileOutputStream(name, true).write((sc.nextLine()+"\n").getBytes());
        System.out.println("File saved.");
    }
}
