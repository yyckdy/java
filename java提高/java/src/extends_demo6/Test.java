package extends_demo6;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("aaa");
        s.setAge(21);
        System.out.println(s.getAge());
        System.out.println(s.getName());
        s.queryCourse();
        s.writeInfo();
    }
}
