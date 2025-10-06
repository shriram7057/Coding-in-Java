import java.io.*;
class Write_to_file
{
    public static void main(String[] args) throws IOException
    {
        try(FileWriter f=new FileWriter("Shriram.txt"))
        {
            f.write("Hello Shriram! How Are You?......");
            System.out.println("Successfully written to the file.");
        }
    }
}