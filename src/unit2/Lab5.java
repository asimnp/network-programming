// Program to illustrate isLinkLocalAddress()
package unit2;

import java.net.*;

public class Lab5 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Hostname: " + address.getHostName());
            System.out.println("IP: " + address.getHostAddress());
            System.out.println("Is link local address? " + address.isLinkLocalAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
        }
    }
}
