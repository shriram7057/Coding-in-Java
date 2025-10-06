import java.io.*;
class File_Ex3 
{
    public static void main(String[] args) 
    {
        for(String name : new File("C:\\Users\\dell\\OneDrive\\Desktop\\Coding In java2\\File_Handling").list())
            System.out.println(name);
    }
}
