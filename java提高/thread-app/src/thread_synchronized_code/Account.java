package thread_synchronized_code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    //唯一不可替换的
    private final Lock lock = new ReentrantLock();


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
    }


    public synchronized/*方法锁*/ void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        lock.lock();//上锁
        //同步代码块 线程锁
        synchronized (this) {//建议使用共享资源作为锁对象
            if (this.money >= money) {
                System.out.println(name + "取钱成功");
                this.money -= money;
                System.out.println(name + "取钱后剩余余额" + this.money);
            } else {
                System.out.println(name + "来取钱余额不够");
            }
            lock.unlock();//解锁
        }
    }
}
