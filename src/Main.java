import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");

            System.out.println("Hostname: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}