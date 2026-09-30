package unit3;

import java.net.HttpURLConnection;
import java.net.URL;

public class Lab4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();


            for(int i = 1; i <= 8; i++) {
                System.out.println(urlCon.getLastModified() + " = " + urlCon.getHeaderField(i));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
