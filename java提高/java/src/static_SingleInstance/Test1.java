package static_SingleInstance;

public class Test1 {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
//        SingleInstance s3=new SingleInstance();构造器私有
        System.out.println(s1);
        System.out.println(s2);
    }
}
