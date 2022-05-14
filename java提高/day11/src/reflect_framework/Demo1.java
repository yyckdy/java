package reflect_framework;

public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student("yy", '男', 18, "2004", "no");
        MybatisUtil.save(s);
        MybatisUtil.save(new Teacher("yy", '男', 999.99));
    }
}
