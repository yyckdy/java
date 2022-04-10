package static_SingleInstance;

public class Test2 {
    public static void main(String[] args) {
        SingInstance2 s1=SingInstance2.getInstance();
        SingInstance2 s2=SingInstance2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
