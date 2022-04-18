package Lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        //Lambda 标准格式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("wuGui is run");
            }
        };
        a.run();


    }
}

abstract class Animal {
    public abstract void run();
}
