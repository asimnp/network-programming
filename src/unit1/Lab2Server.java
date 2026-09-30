package unit1;

import java.io.*;
import java.net.*;

public class Lab2Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server waiting for client");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        out.println("Welcome! This is sent from server.");
        out.println("Server time: " + new java.util.Date());
        out.println("END");

        out.close();
        clientSocket.close();
        serverSocket.close();
    }
}
