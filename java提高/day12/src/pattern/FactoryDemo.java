package pattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer c = FactorPattern.createComputer("mac");
        c.start();
    }
}
