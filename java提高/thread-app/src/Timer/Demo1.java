package Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer 定时器
 */
public class Demo1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "AA执行一次" + new Date());
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "BB执行一次" + new Date());
                System.out.println(10/0);
            }
        }, 0, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "CC执行一次" + new Date());
            }
        }, 0, 2000);
    }
}
