package 即时通信;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class NewDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("==客服端启动==");
            Socket socket = new Socket("127.0.0.1", 9999);
            new ClintReaderThread(socket).start();
            Scanner sc = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            //发数据
            while (true) {
                System.out.println("输入消息");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ClintReaderThread extends Thread {
    private final Socket socket;

    ClintReaderThread(Socket socket) {
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
            }
            System.out.println("被服务端踢出～～～");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
