package unit6;

import java.net.Socket;
import java.net.SocketException;

public class Lab5 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket();

            s.setReuseAddress(true);
            s.setTcpNoDelay(true);
            s.setKeepAlive(true);
            s.setSoLinger(true, 10);
            s.setSendBufferSize(1024 * 1024);
            s.setReceiveBufferSize(1024 * 1024);
            s.setTrafficClass(0x10);
            s.setSoTimeout(30000);
        } catch (SocketException e) {
            System.out.println(e.getMessage());
        }

    }
}
