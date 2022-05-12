package udp通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 发送端
 */
public class ClientDemo1 {
    public static void main(String[] args) {
        try {
            //创建发送端对象:自带默认端口号
            DatagramSocket socket = new DatagramSocket();
            //数据包对象
            /*
              1.要发送的数据 字节数组
              2.发送数据的大小
              3.服务端ip地址
              4.服务端端口
             */
            byte[] buffer = "hello world".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

            //发送数据
            socket.send(packet);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}