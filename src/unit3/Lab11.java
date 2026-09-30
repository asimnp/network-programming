import java.net.*;
import java.nio.charset.StandardCharsets;

public class Lab11 {
    public static void main(String[] args) throws Exception {
        String name = "Ram Sharma & Sons";

        String encoded = URLEncoder.encode(
                name, StandardCharsets.UTF_8);

        URL url = new URL(
                "https://httpbingo.org/get?name=" + encoded);

        System.out.println("Encoded: " + encoded);
        System.out.println(url.openStream()
                .transferTo(System.out));
    }
}
