package 构造器;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("==调用无参构造器==");
    }
    public Car(String name,double price){
        this.name=name;
        this.price=price;
        System.out.println("==调用有参构造==");
    }

    public void run(){
        System.out.println("方法中的this："+this);
    }
}
