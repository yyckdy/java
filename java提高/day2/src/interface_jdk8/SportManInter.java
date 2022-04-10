package interface_jdk8;

public interface SportManInter {
    /**
     * 默认方法 default修饰 默认public
     * 方法只能由实现类的对象调用
     */
    default void run() {
        System.out.println("-----run-----");
//        go();
    }


    /**
     * 静态方法
     * static修饰 默认public
     */
    public static void Add() {
        System.out.println("-----add-----");
    }

//    private void go(){
//        System.out.println("-----go-----");
//    }

}

class PingPongMan implements SportManInter {
}

class Test {
    public static void main(String[] args) {
        PingPongMan m = new PingPongMan();
        m.run();
        SportManInter.Add();//只能接口名调用
    }
}
