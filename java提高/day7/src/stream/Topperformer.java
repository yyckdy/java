package stream;

public class Topperformer {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public Topperformer() {
    }

    @Override
    public String toString() {
        return "Topperformer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Topperformer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
