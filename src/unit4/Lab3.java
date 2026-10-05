// Write a Java program using CookieManager, CookieStore, and HttpCookie.

package unit4;

import java.net.*;
import java.util.*;

public class Lab3
{
    public static void main(String[] a){
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        // creating cookies and URI
        HttpCookie cookieA = new HttpCookie("c1", "ram");
        HttpCookie cookieB = new HttpCookie("c2", "sita");
        HttpCookie cookieC = new HttpCookie("c3", "hari");

        URI uri1 = URI.create("https://test1.com/");
        URI uri2 = URI.create("https://test2.com/");

        // Add cookies into cookiestore
        cookieStore.add(uri1, cookieA);
        cookieStore.add(uri2, cookieB);
        cookieStore.add(null, cookieC);

        // Read stored all cookies
        List cookieList = cookieStore.getCookies();
        System.out.println("Cookies list in CookieStore : " + cookieList + "\n");

        // remove cookie of uri1 (FIXED: changed 'uri' to 'uri1')
        cookieStore.remove(uri1, cookieA);
        List remainingCookieList = cookieStore.getCookies();

        // Output remaining cookies (FIXED: printing remainingCookieList instead of cookieList)
        System.out.println("Remaining Cookies : " + remainingCookieList + "\n");

        // remove all cookies
        cookieStore.removeAll();
        List EmptyCookieList = cookieStore.getCookies();

        // Output empty store (FIXED: printing EmptyCookieList instead of cookieList)
        System.out.println("Empty CookieStore : " + EmptyCookieList);
    }
}
