package udp通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 */
public class ClientDemo2 {
    public static void main(String[] args) {
        try {
            //创建接收对象
            DatagramSocket socket = new DatagramSocket(8888);
            //创建一个数据包对象接收数据
            byte[] buffer = new byte[1024 * 64];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            //等待接收数据
            socket.receive(packet);
            String rs = new String(buffer, 0, packet.getLength());
            System.out.println(rs);
            System.out.println(packet.getSocketAddress().toString());//获取服务端ip
            System.out.println(packet.getPort());//获取服务端端口
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
