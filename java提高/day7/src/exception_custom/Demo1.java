package exception_custom;

/**
 * 自定义异常
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            checkAge(34);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 200) {
            //抛出异常对象给调用者
            //throws 方法声明上，抛出内部异常
            //throw在方法内部创建异常对象抛出
            throw new AgeIlleagalRuntimeExpection(age + " is illeagal");
        } else {
            System.out.println("年龄合法");
        }
    }
}
