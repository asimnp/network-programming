// Program to illustrate isMCGlobal() method
package unit2;

import java.net.InetAddress;

public class Lab9 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Name: " + address.getHostName());
            System.out.println("Address: " + address.getHostAddress());
            System.out.println("Is MC Global: " + address.isMCGlobal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
