package reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent01 {
    public TestStudent01() throws NoSuchMethodException {
    }

    @Test
    public void getConstructors() {
        //1.获取类对象
        Class c = Student.class;
        //2.提取类中全部的构造器对象
        Constructor[] constructors = c.getConstructors();//public 构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getDeclaredConstructors() {
        Class c = Student.class;
        Constructor[] constructors = c.getDeclaredConstructors();// 全部构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    @Test
    public void getConstructor() throws Exception {
        Class c = Student.class;
        Constructor constructor = c.getConstructor();// 单个构造器对象 按照参数定位无参构造器 public
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        Student s = (Student) constructor.newInstance();//返回对象 public
        System.out.println(s);
    }

    @Test
    public void getDeclaredConstructor() throws Exception {
        Class c = Student.class;
        Constructor constructor = c.getDeclaredConstructor(String.class, int.class);// 根据参数获取构造器
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        constructor.setAccessible(true);//设置权限 暴力反射
        Student s = (Student) constructor.newInstance("yy", 100);
        System.out.println(s.toString());
    }


}
