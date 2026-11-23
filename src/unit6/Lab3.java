package unit6;

import java.io.IOException;
import java.net.Socket;

public class Lab3 {
    public static void main(String[] args) {
        String urlhost = "livealth.com";

        try {
            Socket s = new Socket(urlhost, 80);
            System.out.println("Connected to " + s.getInetAddress() + " on port " + s.getPort() + " from prot " + s.getLocalPort() + " of " + s.getLocalAddress());
            System.out.println(s.toString());
            System.out.println("Is bound: " + s.isBound());
            System.out.println("Is closed: " + s.isClosed());
            System.out.println("Is connected: " + s.isConnected());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
