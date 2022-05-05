package net;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.net.InetAddress;
import java.util.Timer;
import java.util.TimerTask;

public class InetAddressDemo1 {
    public static void main(String[] args) throws Exception {
        //获取本机ip地址
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());//主机名
        System.out.println(ip1.getHostAddress());//String类型的主机名

        //获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        System.out.print("\n");

        //获取公网ip对象
        InetAddress ip3 = InetAddress.getByName("180.101.49.11");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        //判断是否互通
        System.out.println(ip1.isReachable(5000));
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (!InetAddress.getLocalHost().isReachable(5000)) {
                        System.out.println("连接断开");
                    }
                } catch (Exception e) {
                    System.out.println("ip地址有误");
                    e.printStackTrace();
                }
            }
        }, 0, 10000);
    }

    @Test
    public void test() {

    }


}




