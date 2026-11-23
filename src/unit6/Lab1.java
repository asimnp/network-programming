package unit6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Lab1 {
    public static void main(String[] args) {
        try (Socket s = new Socket("time.nist.gov", 13);
             InputStream in = s.getInputStream();
             InputStreamReader isr = new InputStreamReader(in, StandardCharsets.US_ASCII);
             BufferedReader br = new BufferedReader(isr)) {
            int line;
            while ((line = br.read()) != -1) {
                System.out.print((char) line);
            }
            System.out.println();
            System.out.println("Local Time: " + new Date());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
