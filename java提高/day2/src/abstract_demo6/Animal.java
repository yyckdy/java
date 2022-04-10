package abstract_demo6;
//抽象类
public abstract class Animal {
    public abstract void run();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
