package unit5;

import java.net.URL;
import java.net.URLConnection;

public class Lab3 {
    public static void main(String[] args) throws Exception {
        String resource = "https://asm.edu.np";

        URL url = new URL(resource);
        URLConnection conn = url.openConnection();

        for (int i = 1;; i++) {
            String headerField = conn.getHeaderFieldKey(i);
            if (headerField == null) {
                break;
            }
            System.out.println(headerField + ": " + conn.getHeaderField(i));
        }
    }
}
