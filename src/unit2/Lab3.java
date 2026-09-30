// WAP to check if the given IP address are equal or not
package unit2;

import java.net.*;

public class Lab3 {
   public static void main(String[] args) {
       try {
           InetAddress host1 = InetAddress.getByName("www.google.com");
           InetAddress host2 = InetAddress.getByName("www.google.com");

           System.out.println("Host1: " + host1.getHostName());
           System.out.println("Host2: " + host2.getHostName());

           if (host1.equals(host2)) {
               System.out.println("Both hosts are equals");
           } else {
               System.out.println("Hosts are not equals");
           }
       } catch (UnknownHostException e) {
           System.out.println(e.getMessage());
       }
   }
}
