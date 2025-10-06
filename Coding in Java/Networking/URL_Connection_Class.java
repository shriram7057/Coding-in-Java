import java.net.*;
import java.io.*;

public class URL_Connection_Class {
    public static void main(String[] args) 
    {
        try 
        {
            // Create a URL object
            URL url = new URL("https://www.google.com");
            
            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Get content type
            System.out.println("Content Type: " + connection.getContentType());
            // Get content length
            System.out.println("Content Length: " + connection.getContentLength());
            // Get content encoding
            System.out.println("Content Encoding: " + connection.getContentEncoding());
            // Get date
            System.out.println("Date: " + connection.getDate());
            // Get expiration date
            System.out.println("Expiration: " + connection.getExpiration());
            // Get last modified date
            System.out.println("Last Modified: " + connection.getLastModified());
            // Get header fields
            System.out.println("Header Fields: " + connection.getHeaderFields());
            // Get permission
            System.out.println("Permission: " + connection.getPermission());
            // Get URL
            System.out.println("URL: " + connection.getURL());

            // Read data from URL
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            System.out.println("\nFirst 5 lines of content:");
            int count = 0;
            while ((line = br.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }
            br.close();

        } catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
