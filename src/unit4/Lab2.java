//  WAP to set cookieManager cookie policy to accept all the cookies, no cookies, and cookies from the original server
package unit4;

import java.net.*;

public class Lab2 {
    public static void main(String[] args)
    {
        // create instance of cookieManager
        CookieManager cookieManager = new CookieManager();
        // set cookieManager cookie policy using
        // setCookiePolicy method
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        System.out.println("Cookie Policy for cookieManager is set to : CookiePolicy.ACCEPT_ALL");

        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_NONE);
        System.out.println("Cookie Policy for cookieManager is set to : CookiePolicy.ACCEPT_NONE");

        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        System.out.println("Cookie Policy for cookieManager is set to : CookiePolicy.ACCEPT_ORIGINAL_SERVER");
    }
}
