package static_demo1;

public class Test {
    private String name;
    private void run(){
        System.out.println("run");
    }

    public static int onlineNumber=10;
    public static void test2(){
        System.out.println("==========");
    }

    public  static void test(){
        System.out.println(onlineNumber);
        System.out.println(Test.onlineNumber);
        test2();
        Test.test2();
    }

    public static void test3(){
//        System.out.printf(this);this不能出现在静态方法

    }



    public void go(){
        System.out.println(onlineNumber);
        test2();
        Test.test2();
        System.out.println(name);
        run();
        System.out.println(this);
    }
    public static void main(String[] args) {
        test();
        Test test=new Test();
        test.go();
    }
}
