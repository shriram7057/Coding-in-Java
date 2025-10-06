import java.net.*;
import java.io.*;

public class HTTP_URl_Class {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.google.com");
            
            // Open HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");
            // Set request properties (optional)
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            // Set timeout (optional)
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // Get response code
            System.out.println("Response Code: " + connection.getResponseCode());
            // Get response message
            System.out.println("Response Message: " + connection.getResponseMessage());
            // Get request method
            System.out.println("Request Method: " + connection.getRequestMethod());
            // Get content type
            System.out.println("Content Type: " + connection.getContentType());
            // Get content length
            System.out.println("Content Length: " + connection.getContentLength());
            // Get headers
            System.out.println("Header Fields: " + connection.getHeaderFields());

            // Read data from the connection
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            System.out.println("\nFirst 5 lines of content:");
            int count = 0;
            while ((line = br.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }
            br.close();

            // Disconnect
            connection.disconnect();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
