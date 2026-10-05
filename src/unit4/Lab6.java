package unit4;

import java.io.*;
import java.net.*;
import jdk.net.ExtendedSocketOptions;   // Java 11+ (per-socket TCP keep-alive tuning)

public class Lab6 {

    public static void main(String[] args) throws Exception {

        // ---------- 1. HTTP keep-alive: system properties ----------
        System.setProperty("http.keepAlive", "true");              // enable persistent connections (default true)
        System.setProperty("http.maxConnections", "10");           // max idle connections kept per host (default 5)
        System.setProperty("http.keepAlive.time.server", "10");    // idle seconds kept for server (JDK-specific)
        System.setProperty("http.keepAlive.time.proxy", "10");     // idle seconds kept for proxy (JDK-specific)

        // ---------- 2. HTTP keep-alive: headers, two requests ----------
        for (int i = 1; i <= 2; i++) {
            URL url = new URL("http://example.com/");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Connection", "keep-alive");    // ask to keep connection open
            // con.setRequestProperty("Connection", "close");      // use this to close after response

            System.out.println("Request " + i + " status: " + con.getResponseCode());
            System.out.println("Connection header : " + con.getHeaderField("Connection"));
            System.out.println("Keep-Alive header : " + con.getHeaderField("Keep-Alive")); // e.g. timeout=5, max=1000

            // Read the whole body and close the stream so the connection returns to the pool
            try (InputStream in = con.getInputStream()) {
                while (in.read() != -1) { /* discard */ }
            }
        }

        // ---------- 3. TCP keep-alive: socket options ----------
        try (Socket socket = new Socket("example.com", 80)) {
            socket.setKeepAlive(true);                              // SO_KEEPALIVE on
            System.out.println("SO_KEEPALIVE      : " + socket.getKeepAlive());

            try {
                socket.setOption(ExtendedSocketOptions.TCP_KEEPIDLE, 60);      // idle seconds before first probe
                socket.setOption(ExtendedSocketOptions.TCP_KEEPINTERVAL, 10);  // seconds between probes
                socket.setOption(ExtendedSocketOptions.TCP_KEEPCOUNT, 5);      // failed probes before connection is dead

                System.out.println("TCP_KEEPIDLE      : " + socket.getOption(ExtendedSocketOptions.TCP_KEEPIDLE));
                System.out.println("TCP_KEEPINTERVAL  : " + socket.getOption(ExtendedSocketOptions.TCP_KEEPINTERVAL));
                System.out.println("TCP_KEEPCOUNT     : " + socket.getOption(ExtendedSocketOptions.TCP_KEEPCOUNT));
            } catch (UnsupportedOperationException e) {
                System.out.println("Per-socket keep-alive tuning not supported on this OS/JDK.");
            }
        }
    }
}
