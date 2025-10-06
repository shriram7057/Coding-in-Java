import java.io.*;
import java.util.*;
class File_Scanner_Class {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(new FileInputStream("Shree.txt"))) {
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        }
    }
}
