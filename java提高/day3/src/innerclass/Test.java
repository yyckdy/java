package innerclass;

/**
 * 成员内部类
 */
public class Test {
    public static void main(String[] args) {
       Outer.Inner inner=new Outer().new Inner();//先new外部类对象
        inner.show();
    }
}
