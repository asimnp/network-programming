// **Write a program to demonstrate the x-www-form-url encoded strings.**
package unit4;

import java.net.*;

public class Lab1 {
    public static void main(String[] args) throws Exception {

        String data = "Hello Java Programming!";

        String encoded = URLEncoder.encode(data, "UTF-8");
        String decoded = URLDecoder.decode(encoded, "UTF-8");

        System.out.println("Original: " + data);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}
