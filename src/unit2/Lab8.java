// Program to illustrate isMulticastAddress() method
package unit2;

import java.net.InetAddress;

public class Lab8 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.youtube.com");
            System.out.println("Name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());
            System.out.println("Multicast: " + address.isMulticastAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
