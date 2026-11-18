package unit5;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Lab1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://asm.edu.np");
            URLConnection uricon = url.openConnection();
            InputStream stream = uricon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
