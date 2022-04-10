package polymorphic_demo1;

/**
 * 多态
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog t = (Dog) a;
        t.lookDoor();

        //不能使用子类独有功能 弊端
//        d.lookDoor();
    }
}
