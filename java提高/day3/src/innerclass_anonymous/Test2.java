package innerclass_anonymous;

/**
 * 匿名内部类的使用形式
 */
public class Test2 {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {/*接口的子类*/
                System.out.println("Swimming");
            }
        };
        go(s);
        System.out.println("--------------------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("Swimming faster");
            }
        });//作为方法的形参

    }


    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }

}


interface Swimming {
    void swim();
}
