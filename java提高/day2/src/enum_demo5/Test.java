package enum_demo5;

public class Test {
    public static void main(String[] args) {

    }

    public static void func(Move m) {
        switch (m) {
            case RIGHT -> System.out.println("RIGHT");
            case LEFT -> System.out.println("LEFT");
            case UP -> System.out.println("UP");
            case DOWN -> System.out.println("DOWN");
        }
    }

}


