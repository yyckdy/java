package polymorphic_demo1;

public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("-----Dog run-----");
    }

    public void lookDoor() {
        System.out.println("lookdoor");
    }
}
