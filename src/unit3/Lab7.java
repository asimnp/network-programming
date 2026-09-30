// Program for resolving relative URIs using resolve method.
package unit3;

import java.net.URI;
import java.net.URISyntaxException;

public class Lab7 {
    public static void main(String[] args) throws URISyntaxException {
        URI absolute = new URI("https://www.google.com");
        URI relative = new URI("images/logo.png");
        URI resolved = absolute.resolve(relative);

        System.out.println("Resolved: " + resolved);
    }
}
