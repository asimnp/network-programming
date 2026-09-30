// Program to read data from server
package unit3;

import java.io.InputStream;
import java.net.*;

public class Lab2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.w3schools.com/html/html_intro.asp");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
