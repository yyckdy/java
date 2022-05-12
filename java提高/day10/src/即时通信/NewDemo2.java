package 即时通信;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//服务端
public class NewDemo2 {
    //定义一个list存储在线的socket
    public static List<Socket> allOnlineSockets = new ArrayList<>();

    public static void main(String[] args) {
        try {
            System.out.println("==服务端启动成功===");
            ServerSocket serverSocket = new ServerSocket(9999);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress().toString() + "上线了");
                allOnlineSockets.add(socket);//上线完成
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ServerReaderThread extends Thread {
    private final Socket socket;

    ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "+" + socket.getRemoteSocketAddress() + ": " + msg);
                //转发
                sendMsgToAll(msg);
            }
            System.out.println(socket.getRemoteSocketAddress().toString() + " 下线");
            NewDemo2.allOnlineSockets.remove(socket);//下线
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        for (Socket allOnlineSocket : NewDemo2.allOnlineSockets) {
            if (socket.getRemoteSocketAddress().toString().equals(allOnlineSocket.getRemoteSocketAddress().toString()))
                continue;
            PrintStream ps = new PrintStream(allOnlineSocket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}

