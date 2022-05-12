package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Demo2 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            String msg;
            while ((msg = bf.readLine()) != null) {
                System.out.println(socket.getRemoteSocketAddress().toString() + ":" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
