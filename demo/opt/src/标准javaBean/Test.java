package 标准javaBean;

public class Test {
    public static void main(String[] args) {
        User u1=new User();
        u1.setName("yy");
        u1.setHeight(180.5);
        u1.setSalary(1000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        User u2=new User("yan",100,100);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
