package genericity_limit;


import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);
    }

    public static void go(ArrayList<? extends Car> cars) {

    }
}

class Car {

}

class BMW extends Car {

}

class BENZ extends Car {

}
