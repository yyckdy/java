package extends_constructor_demo10;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher("deli",21);
        System.out.println(t.getAge());
        System.out.println(t.getName());
    }
}
