import java.io.*;
class File_Output_Stream_Class {
    public static void main(String[] args) throws IOException {
        String content = "Welcome to TechTpoint\nHello World!\nWELCOME";
        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write(content.getBytes());
        }
        System.out.println("File created successfully with the content.");
    }
}
