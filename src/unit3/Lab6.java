package unit3;

import java.net.URI;
import java.net.URISyntaxException;

public class Lab6 {
    public static void main(String[] args) throws URISyntaxException {
        URI uri1 = new URI("https://www.google.com");
        URI uri2 = new URI("URN:ISBN:0-395-36341-1");

        System.out.println(uri1);
        System.out.println("Authority: " + uri1.getAuthority());
        System.out.println("Path: " + uri1.getFragment());
        System.out.println("Host: " + uri1.getHost());
        System.out.println("Scheme: " + uri1.getScheme());
        System.out.println("Port: " + uri1.getPort());

        System.out.println("******************************************************");

        System.out.println(uri2);
        System.out.println("Authority: " + uri2.getAuthority());
        System.out.println("Fragement: " + uri2.getFragment());
        System.out.println("Host: " + uri2.getHost());
        System.out.println("Schema: " + uri2.getScheme());
        System.out.println("Port: " + uri2.getPort());
    }
}
