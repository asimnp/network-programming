package unit6;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Lab2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress remote = InetAddress.getLocalHost();
        String hostname = remote.getHostName();
        System.out.println("Scanning ports on: " + hostname + " (" + remote.getHostAddress() + ")");

        for (int port = 1; port <= 65535; port++) {
            try {
                Socket s = new Socket(remote, port);
                System.out.println("A server is listening on port " + port + " of " + hostname);
                s.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
