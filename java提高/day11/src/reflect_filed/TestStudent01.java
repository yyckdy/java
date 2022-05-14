package reflect_filed;


import org.junit.Test;

import java.lang.reflect.Field;

public class TestStudent01 {
    @Test
    public void getDeclaredFields() {
        Class c = Student.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());
        }
    }

    @Test
    public void getDeclaredField() throws Exception {
        Class c = Student.class;
        //根据名称定位某个成员变量
        Field field = c.getDeclaredField("age");
        System.out.println(field.getName() + "===>" + field.getType());
    }

    @Test
    public void setField() throws Exception {
        Class c = Student.class;
        Field field = c.getDeclaredField("age");
        //赋值
        Student s = new Student();
        field.setAccessible(true);
        field.set(s, 100);
        System.out.println(s);

        //取值
        int age =(int) field.get(s);
        System.out.println(age);
    }

}
