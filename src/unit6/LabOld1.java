package unit6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LabOld1 {

    public static void main(String[] args) {

        try {
            // Create server socket
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket socket = server.accept();

            System.out.println("Client connected!");

            // Read data sent by client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String message = input.readLine();

            System.out.println("Message from client: " + message);

            // Close connections
            input.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
