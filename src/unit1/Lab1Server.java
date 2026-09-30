package unit1;

import java.io.*;
import java.net.*;

public class Lab1Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Echo server started");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received: " + line);

            if  (line.equals("exit")) {
                break;
            }

            out.println("Echo from server: " + line);
        }

        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}