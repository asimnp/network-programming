package unit4;


import java.net.*;

public class Lab4 {

    public static void main(String[] args) {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(new CookiePolicy() {
            @Override
            public boolean shouldAccept(URI uri, HttpCookie cookie) {
                String host = uri.getHost().toLowerCase();
                return !host.endsWith(".gov");
            }
        });

        // Set the default CookieManager
        java.net.CookieHandler.setDefault(cookieManager);
        System.out.println("Cookie policy set to block .gov cookies.");
    }
}
