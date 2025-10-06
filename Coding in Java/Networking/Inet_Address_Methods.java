import java.net.*;

public class Inet_Address_Methods {
    public static void main(String[] args) {
        try {
            // Get InetAddress object for a host
            InetAddress address = InetAddress.getByName("www.google.com");

            // Get host name
            System.out.println("Host Name: " + address.getHostName());
            // Get host address (IP)
            System.out.println("Host Address: " + address.getHostAddress());
            // Check if reachable
            System.out.println("Is Reachable: " + address.isReachable(5000));
            // Get local host
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + local.getHostName());
            System.out.println("Local Host Address: " + local.getHostAddress());

            // Get all IPs of a host
            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("All IP Addresses:");
            for (InetAddress addr : allAddresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
