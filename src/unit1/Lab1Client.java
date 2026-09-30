package unit1;

import java.io.*;
import java.net.*;

public class Lab1Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String userInput;
        System.out.println("Type a message(type 'exit' to quite): ");

        while((userInput = keyboard.readLine()) != null) {
            out.println(userInput);

            if (userInput.equals("exit")) {
                break;
            }

            System.out.println(in.readLine());
        }

        keyboard.close();
        out.close();
        in.close();
        socket.close();
    }
}