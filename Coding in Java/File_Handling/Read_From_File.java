import java.io.*;
public class Read_From_File
{
    public static void main(String[] args) throws IOException
    {
        try(BufferedReader br=new BufferedReader(new FileReader("Shriram.txt")))
        {
            br.lines().forEach(System.out::println);
        }
    }
}