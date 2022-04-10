package polymorphic_test;

public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void connect() {
        System.out.println(name+"success connect");
    }

    public void keyDown(){
        System.out.println(name+"keyDown");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"success out");
    }
}
