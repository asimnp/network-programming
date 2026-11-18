package unit3;

import java.net.*;

public class Lab9 {

    public static void main(String[] args) {

        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {

                System.out.println("Authentication requested by: "
                        + getRequestingHost());

                System.out.println("Protocol: "
                        + getRequestingProtocol());

                return new PasswordAuthentication(
                        "student",
                        "12345".toCharArray()
                );
            }
        });

        try {
            URL url = new URL(
                    "https://httpbin.org/basic-auth/student/12345"
            );

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Authentication successful!");
                System.out.println("User authenticated successfully.");
            } else {
                System.out.println("Authentication failed.");
            }

            connection.disconnect();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
