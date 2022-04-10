package polymorphic_test;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void start(){
        System.out.println(name+" is starting");
    }

    public void installUSB(USB u) {
        u.connect();

        if (u instanceof KeyBoard) {
            KeyBoard k = (KeyBoard) u;
            k.keyDown();
        } else if (u instanceof Mouse) {
            Mouse m = (Mouse) u;
            m.dbClick();
        }

        u.unconnect();
    }

    public Computer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
