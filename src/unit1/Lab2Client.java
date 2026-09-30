package unit1;

import java.io.*;
import java.net.*;

public class Lab2Client {
   public static void main(String[] args) throws IOException {
       Socket socket = new Socket("localhost", 6000);
       BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

       String line;
       System.out.println("Information received from server:");

       while ((line = in.readLine()) != null) {
           if (line.equals("END")) {
               break;
           }

           System.out.println(line);
       }

       in.close();
       socket.close();
   }
}
