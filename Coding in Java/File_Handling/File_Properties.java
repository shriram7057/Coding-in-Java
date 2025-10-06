import java.io.*;
class File_Properties
{
    public static void main(String[] args) {
        File f=new File("Shriram.txt");
        if(f.exists())System.err.println("File name: "+f.getName()+"\nAbsolute path: "+f.getAbsolutePath()+"\nWriteable: "+f.canWrite()+"\nReadable: "+f.canRead()+"\nFile size in bytes: "+f.length());
        else System.out.println("The file does not exist.");
    }
}