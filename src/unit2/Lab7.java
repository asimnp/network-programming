// Program to illustrate hashCode()
package unit2;

import java.net.InetAddress;

public class Lab7 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());
            System.out.println("Hashcode: " + address.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
