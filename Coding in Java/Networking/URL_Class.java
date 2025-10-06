// URLDemo.java

import java.net.*;

public class URL_Class 
{
    public static void main(String[] args) {
        try 
        {
            // Create a URL object
            URL url = new URL("https://github.com/shriram7057");

            // Get protocol (https)
            System.out.println("Protocol: " + url.getProtocol());
            // Get host name (github.com)
            System.out.println("Host Name: " + url.getHost());
            // Get port number (-1 if not specified)
            System.out.println("Port Number: " + url.getPort());
            // Get file path after host
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) 
        {
            // Print exception if URL is malformed
            System.out.println(e);
        }
    }
}
