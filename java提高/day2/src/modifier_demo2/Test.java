package modifier_demo2;

public class Test {
    public static void main(String[] args) {
        //权限修饰符 作用范围
        Fu f = new Fu();
        f.publicMethod();
        f.protectedMethod();
        f.method();
//        f.praviteMethod();不支持访问
    }
}
