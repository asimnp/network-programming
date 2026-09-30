// Program to demonstrate URL class.
package unit3;

import java.net.URL;

public class Lab1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.javatpoint.com/java-tutorial");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Hostname: " + url.getHost());
            System.out.println("Portnumber: " + url.getPort());
            System.out.println("Filename: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Default port: " + url.getDefaultPort());
            System.out.println("String: " + url.toString());
            System.out.println("Path: " + url.getPath());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
