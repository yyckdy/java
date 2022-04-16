package innerclass_anonymous;


public class Test {
    public static void main(String[] args) {
        //匿名内部类  方便创建子类对象
        Animal a=new Animal() {/*Animal的子类对象*/
            @Override
            public void run() {
                System.out.println("老虎跑的快");
            }
        };
        a.run();
    }
}

/*class Tiger extends Animal{

    @Override
    public void run() {
        System.out.println("老虎跑得快");
    }
}*/

abstract class Animal{
    public abstract void run();
}
