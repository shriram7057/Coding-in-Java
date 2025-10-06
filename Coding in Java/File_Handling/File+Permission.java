import java.io.*;
import java.security.*;

class FilePermissionExample {
    public static void main(String[] args) 
    {
        String path = "D:\\IO Package\\java.txt";
        FilePermission fp1 = new FilePermission("D:\\IO Package\\-", "read");
        FilePermission fp2 = new FilePermission(path, "write");
        PermissionCollection pc = fp1.newPermissionCollection();
        pc.add(fp1); pc.add(fp2);

        System.out.println(pc.implies(new FilePermission(path, "read,write")) 
            ? "Read, Write permission granted for " + path 
            : "No Read, Write permission granted for " + path);
    }
}
