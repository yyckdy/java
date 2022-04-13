package innerclass_ststic;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.setName("zhangsan");
        inner.setAge(100);
        inner.show();

    }
}
