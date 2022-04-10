package interface_implements;

/**
 * 接口的基本使用 被类实现
 */
public class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan("yy");
        p.competition();
        p.run();
    }

}
