package unit1;

import java.io.*;
import java.net.*;

public class Lab3Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        Thread readerThread = new Thread(() -> {
           String msg;

           try {
               while ((msg = in.readLine()) != null) {
                   System.out.println("Server: " + msg);
               }
           } catch (IOException e) {
               System.out.println("Connection closed");
           }
        });

        readerThread.start();
        String outMsg;

        while ((outMsg = keyboard.readLine()) != null) {
            out.println(outMsg);

            if (outMsg.equalsIgnoreCase("exit")) {
                break;
            }
        }

        socket.close();
    }
}
