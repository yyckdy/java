package muiltcast;

import java.net.*;

/**
 * 接收端
 */
public class ClientDemo4 {
    public static void main(String[] args) {
        try {
            MulticastSocket socket = new MulticastSocket(9999);

            //当前接收端绑定组播ip
            socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.0.1"), 9999), NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));
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
