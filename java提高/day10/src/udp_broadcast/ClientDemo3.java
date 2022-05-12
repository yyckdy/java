package udp_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 多发多收
 */
public class ClientDemo3 {
    public static void main(String[] args) {
        try {
            //创建发送端对象:自带默认端口号
            DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("输入消息");
                String msg = sc.nextLine();
                if ("exit".equals(msg)) break;
                byte[] buffer = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("255.255.255.255"),
                        9999);
                socket.send(packet);
            }
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}