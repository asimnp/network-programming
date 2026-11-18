package unit5;

import java.net.*;

public class Lab2 {
    public static void main(String[] args) throws Exception {
        String resource = "https://asm.edu.np";

        URL url = new URL(resource);
        URLConnection conn = url.openConnection();

        String contentType = conn.getHeaderField("Content-Type");
        String transferEncoding = conn.getHeaderField("Transfer-Encoding");
        String connection = conn.getHeaderField("Connection");

        System.out.println("Content-Type: " + contentType);
        System.out.println("Transfer-Encoding: " + transferEncoding);
        System.out.println("Connection: " + connection);
    }
}
