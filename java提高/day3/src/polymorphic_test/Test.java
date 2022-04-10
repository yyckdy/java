package polymorphic_test;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("yy");
        c.start();
        USB u = new KeyBoard("keyboard");
        c.installUSB(u);
        USB u1 = new Mouse("mouse");
        c.installUSB(u1);
    }
}
