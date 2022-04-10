package extends_filed_method;

public class Test {
    //继承后成员的访问特点
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.showName();
    }
}

class Animal {
    public String name = "aaa";

    public void run() {
        System.out.println("Animal can run");
    }
}

class Dog extends Animal {
    @Override
    public void run() {
        super.run();
        System.out.println("Dog can run");
    }

    public String name = "dog";

    public void showName() {
        String name = "showName";
        //super访问父类成员
        System.out.println(super.name);
    }

    public void lookDoor() {
        System.out.println("Dog can look door");
    }
}

class Dog1 extends Dog{
}
