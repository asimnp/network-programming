// Program to illustrate toString() method
package unit2;

import java.net.InetAddress;

public class Lab11 {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.facebook.com");
            InetAddress ip2 = InetAddress.getByName("www.google.com");
            String str1 = ip.toString();
            String str2 = ip2.toString();
            System.out.println("1. " + str1);
            System.out.println("2. " + str2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
