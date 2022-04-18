package static_demo1;

public class User {
    public static int onlineNumber=161;
    private String name;
    private int age;


    public static void main(String[] args) {
        // static修饰成员变量的特点
        System.out.println(User.onlineNumber);


        User user=new User();
        user.name="张三";
        user.age=21;

        user.onlineNumber++;
        System.out.println(user.onlineNumber);
        System.out.println(++onlineNumber);
    }

}
