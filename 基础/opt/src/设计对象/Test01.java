package 设计对象;

public class Test01 {
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "ssb";
        c.price = 38.9;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();
        System.out.println("---------------");
        Car c2=new Car();
        c2.price=39.9;
        c2.name="ben";
        c2.start();
        c2.run();
    }
}
