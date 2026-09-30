// Program to illustrate isAnyLocalAddress()
package unit2;

import java.net.*;

public class Lab4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Name: " + address.getHostName());
            System.out.println("IP: " + address.getHostAddress());
            System.out.println("Is IP Address Local Address: " + address.isAnyLocalAddress());
        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException: " + e.getMessage());
        }
    }
}
