package pattern;

public class Mac extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "mac启动");
    }
}
