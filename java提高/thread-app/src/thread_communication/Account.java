package thread_communication;

public class Account {
    private String cardId;
    private double money;


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

    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money >= money) {
                //可取
                this.money -= money;
                System.out.println(name + "来取钱" + money + "成功");
                this.notifyAll();//唤醒所以线程
                this.wait();//锁对象，让当前线程进入等待
            } else {
                //不可取
                //唤醒别人等待自己
                this.notifyAll();//唤醒所以线程
                this.wait();//锁对象，让当前线程进入等待
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void depositMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if (this.money == 0) {
                //存钱
                this.money += money;
                System.out.println(name + "存钱" + money + "成功！存钱后余额为：" + this.money);
                //有钱了 唤醒别人
                this.notifyAll();
                this.wait();
            }else{
                //有钱 不存
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
