package api_object;

/**
 * object类tostring方法 子类重写
 */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("zhangsan", '男', 19);
       /* String rs= s.toString();//返回对象的地址
        System.out.println(rs);*/
        System.out.println(s);
    }
}
