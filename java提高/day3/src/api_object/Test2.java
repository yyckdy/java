package api_object;

/**
 * equals方法
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", '男', 19);
        Student s2 = new Student("zhangsan", '男', 19);
        System.out.println(s1.equals(s2));
    }
}
