package unit1;

import java.io.*;
import java.net.*;

public class Lab3Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7000);
        System.out.println("Chat server started. Waiting for client");

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        Thread readThread = new Thread(() -> {
           String msg;

           try {
               while ((msg = in.readLine()) != null) {
                   System.out.println("Client: " + msg);
               }
           } catch (IOException e) {
               System.out.println("Connection closed.");
           }
        });

        readThread.start();
        String outMsg;
        while ((outMsg = keyboard.readLine()) != null) {
            out.println(outMsg);

            if (outMsg.equalsIgnoreCase("exit")) {
                break;
            }
        }
        clientSocket.close();
        serverSocket.close();
    }
}
