package udp_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */
public class ClientDemo4 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9999);
            byte[] buffer = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while (true) {
                socket.receive(packet);
                String rs = new String(buffer, 0, packet.getLength());
                System.out.println("收到了来自" + packet.getAddress() + "的消息" + rs);
            }
//            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
