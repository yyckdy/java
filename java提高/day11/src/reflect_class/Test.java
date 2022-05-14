package reflect_class;

import java.lang.reflect.Constructor;

/**
 * 获取class对象
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.class.forName(全限名)
        Class c = Class.forName("reflect_class.Student");
        System.out.println(c);

        //2.类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        //3.对象.getClass
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);

        Constructor<?>[] constructors = Student.class.getConstructors();
        System.out.println(constructors.length);

    }
}
