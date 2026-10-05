package unit4;

import java.io.InputStream;
import java.net.*;
import java.util.*;

public class Lab5 {
    public static void main(String[] args) throws Exception {

        String uri = "https://asm.edu.np/";

        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);

        URL url = new URL(uri);
        URLConnection connection = url.openConnection();

        // FIX: Override Java's default User-Agent header to bypass HTTP 403 Forbidden
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");

        // Read the stream to force connection execution and allow CookieManager to capture cookies
        try (InputStream is = connection.getInputStream()) {
            is.readAllBytes();
        }

        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookieList = cookieStore.getCookies();

        if (cookieList.isEmpty()) {
            System.out.println("Connection successful, but no cookies were returned by the server.");
        } else {
            for (HttpCookie cookie : cookieList) {
                System.out.println("Domain name is: " + cookie.getDomain());
                System.out.println("Cookie name is: " + cookie.getName());
            }
        }
    }
}
