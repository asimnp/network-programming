package unit3;

import java.net.URL;

public class Lab5 {
    public static void main(String[] args) {
        try {
            URL www = new URL("https://google.com");
            URL google = new URL("https://google.com");

            if (www.equals(google)) {
                System.out.println("Same URL");
            } else {
                System.out.println("Different URL");
            }
        } catch (Exception e) {

        }
    }
}
