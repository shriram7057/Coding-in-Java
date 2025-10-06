import java.net.*;

public class URL_Class2 {
    public static void main(String[] args) 
    {
        try 
        {
            // Create a URL object
            URL url = new URL("https://www.google.com/search?q=google&oq=google&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDIKCAMQABixAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQBRhA0gEIMzg2NWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");

            // Get and print the protocol (https)
            System.out.println("Protocol: " + url.getProtocol());
            // Get and print the host name (www.google.com)
            System.out.println("Host Name: " + url.getHost());
            // Get and print the port number (-1 if not specified)
            System.out.println("Port Number: " + url.getPort());
            // Get and print the default port for the protocol (443 for https)
            System.out.println("Default Port Number: " + url.getDefaultPort());
            // Get and print the query string after '?'
            System.out.println("Query String: " + url.getQuery());
            // Get and print the path after the host
            System.out.println("Path: " + url.getPath());
            // Get and print the file name with query
            System.out.println("File: " + url.getFile());

        } catch (Exception e) {
            // Handle malformed URL or other exceptions
            System.out.println(e);
        }
    }
}
