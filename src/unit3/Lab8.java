// Program to resolving relative URIs using relativez method.
package unit3;

import java.net.URI;
import java.net.URISyntaxException;

public class Lab8 {
    public static void main(String[] args) throws URISyntaxException {
        URI absolute  = new URI("http://www.example.com/images/logo.png");
        URI top = new URI("http://www.example.com");
        URI resolved = top.relativize(absolute);

        System.out.println("Relative path: " + resolved);
    }
}
