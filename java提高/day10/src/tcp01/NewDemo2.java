package tcp01;

import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class NewDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("==服务端启动成功===");
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress().toString() + " 上线");
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
