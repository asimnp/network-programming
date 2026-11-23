package unit6;

import java.io.PrintWriter;
import java.net.Socket;

public class LabOld2 {

    public static void main(String[] args) {

        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to server!");

            // Get output stream
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true
            );

            // Send message to server
            output.println("Hello Server!");

            System.out.println("Message sent successfully!");

            // Close connection
            output.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
