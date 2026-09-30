// WAP to demonstrate InetAddress Class - Factory Methods

package unit2;

import java.net.*;

public class Lab2 {
    public static void main(String[] args) {
        try {
            InetAddress ip1 = InetAddress.getLocalHost();
            System.out.println("Localhost: " + ip1);

            InetAddress ip2 = InetAddress.getByName("www.youtube.com");
            System.out.println("IP address: " + ip2);

            InetAddress ip3[] = InetAddress.getAllByName("www.google.com");

            for (int i = 0; i < ip3.length; i++) {
                System.out.println("Google different ip: " + ip3[i]);
            }
        } catch (UnknownHostException e) {
            System.out.println("Unknown host exception: " + e.getMessage());
        }
    }
}
