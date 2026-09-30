package lab1;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started 5000...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client accepted.");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            String message = input.readLine();
            System.out.println("Client: " + message);

            output.println(message);

            clientSocket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
