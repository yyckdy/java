package static_demo3;

public class StaticDemo2 {
    /**
     * 实例代码块 调用构造器之前执行
     */
    {
        System.out.println("----------实例代码块执行----------");
        name="zhangsan";
    }

    StaticDemo2(){
        System.out.println("----------构造器----------");
        System.out.println(name);
    }

    public static void main(String[] args) {
        StaticDemo2 s=new StaticDemo2();
        StaticDemo2 s2=new StaticDemo2();
    }

    private String name;
}
