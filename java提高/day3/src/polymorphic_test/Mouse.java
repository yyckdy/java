package polymorphic_test;

public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void dbClick() {
        System.out.println(name + "click");
    }

    @Override
    public void connect() {
        System.out.println(name + "success connect");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "success out");
    }
}
