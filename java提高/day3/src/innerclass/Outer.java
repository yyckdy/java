package innerclass;

public class Outer {
    public int age;
    class Inner{
        private String name;
        private int age;
        public static int a;//jdk16以后
        public static void test(){

        }
        public void show(){
            System.out.println(Outer.this.age);
        }
    }
}
