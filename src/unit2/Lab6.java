// Program to illustrate getLoopbackAddress() and isLoopAddress()
package unit2;

import java.net.*;

public class Lab6 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLoopbackAddress();
            System.out.println("IP address is " + address.getHostAddress());

            InetAddress localAddress = InetAddress.getByName("127.0.0.1");
            System.out.println("Local address is " + localAddress.getHostAddress());
            System.out.println("Is local loopback address? " + localAddress.isLoopbackAddress());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
