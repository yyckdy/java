package tcp01;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class NewDemo1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("127.0.0.1", 9999);
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            while (true) {
                System.out.println("输入消息");
                String msg = scanner.nextLine();
//                if ("exit".equals(msg)) break;
                ps.println(msg);
                ps.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
