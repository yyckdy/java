package static_demo1;


public class Student {
    private String name;

    //归属于类，可以被共享访问
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    /**
     * 实例方法:只能用对象访问
     */
    public void study() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        //类名访问
        System.out.println(Student.getMax(10, 3));

        //同一个类中访问静态方法类名可以不写
        System.out.println(getMax(10, 32));

        Student s = new Student();
        s.name = "aaa";
        s.study();

//        System.out.println(s.getMax(10, 100));

    }
}
