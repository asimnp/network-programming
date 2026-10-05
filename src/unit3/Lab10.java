package unit3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Lab10 {

    public static void main(String[] args) throws Exception {

        // Allow Basic authentication for HTTPS proxy tunneling
        System.setProperty(
                "jdk.http.auth.tunneling.disabledSchemes",
                ""
        );

        String username = "YOUR_USERNAME";
        String password = "YOUR_PASSWORD";

        Authenticator.setDefault(new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                System.out.println("Authentication requested");

                System.out.println("Host: "
                        + getRequestingHost());

                System.out.println("Port: "
                        + getRequestingPort());

                System.out.println("Type: "
                        + getRequestorType());

                return new PasswordAuthentication(
                        username,
                        password.toCharArray()
                );
            }
        });

        // Webshare proxy
        String proxyHost = "38.154.185.97";
        int proxyPort = 6370;

        Proxy proxy = new Proxy(
                Proxy.Type.HTTP,
                new InetSocketAddress(
                        proxyHost,
                        proxyPort
                )
        );

        // Target server
        URL url = new URL(
                "https://ipv4.webshare.io/"
        );

        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection(proxy);

        connection.setRequestMethod("GET");

        System.out.println(
                "Response Code: "
                        + connection.getResponseCode()
        );

        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                connection.getInputStream()
                        )
                );

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();

        connection.disconnect();
    }
}
