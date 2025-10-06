import java.io.*;

class Random_Access_File {
    static final String FILE = "myFile.TXT";

    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(FILE, "r")) {
            byte[] b = new byte[18];
            file.seek(0);
            file.read(b);
            System.out.println(new String(b));
        }
        try (RandomAccessFile file = new RandomAccessFile(FILE, "rw")) {
            file.seek(31);
            file.write("I love my country and my people".getBytes());
        }
    }
}
