package extends_feature_demo7;

public class Test {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        System.out.println(t.string);
    }
}

class Animal{

    static String string="aaa";
    private void eat(){
        System.out.println("Animals need to eat");
    }
}

class Tiger extends Animal{

}
