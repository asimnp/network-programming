package unit6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class Lab4 {
    public static void main(String[] args) {
        String urlhost = "www.javapoint.com";

        try {
            Socket s = new Socket(urlhost, 80);
            System.out.println("Connected to " + s.getInetAddress() + " on port " + s.getPort() + " from port " + s.getLocalPort() + " of " + s.getLocalAddress());
        } catch (SocketException e) {
            System.err.println("Host does not exist: " + urlhost);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
