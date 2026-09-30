// Program to demonstrate the use of HttpURLConnection
package unit3;

import java.net.HttpURLConnection;
import java.net.URL;

public class Lab3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com/watch?v=rJEB-0yCKw");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            for (int i = 1; i <=8; i++) {
                System.out.println(connection.getHeaderFieldKey(i) + " : " + connection.getHeaderField(i));
            }

            connection.disconnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
