import java.io.*;
class File_Ex4 
{
    public static void main(String[] args) 
    {
        for(File f : new File("C:\\Users\\dell\\OneDrive\\Desktop\\Coding In java2\\File_Handling").listFiles())
            System.out.println(f.getName()+" W:"+f.canWrite()+" H:"+f.isHidden()+" L:"+f.length()+" bytes");
    }
}
