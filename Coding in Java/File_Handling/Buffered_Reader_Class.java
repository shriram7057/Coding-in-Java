import java.io.*;
class Buffered_Reader_Class {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("Shree.txt"))) {
            String line;
            while ((line = br.readLine()) != null)
                System.out.println(line);
        }
    }
}
