package unit3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Lab10 {

    public static void main(String[] args) throws Exception {

        String proxyHost = "38.154.185.97";
        int proxyPort = 6370;

        String username = "cxeglkys";
        String password = "bjje1ucvalci";

        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication(
                        username,
                        password.toCharArray()
                );
            }
        });

        Proxy proxy = new Proxy(
                Proxy.Type.HTTP,
                new InetSocketAddress(proxyHost, proxyPort)
        );

        URL url = new URL("https://ipv4.webshare.io/");

        HttpURLConnection connection =
                (HttpURLConnection) url.openConnection(proxy);

        connection.setRequestMethod("GET");

        System.out.println(
                "Response Code: " +
                        connection.getResponseCode()
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
