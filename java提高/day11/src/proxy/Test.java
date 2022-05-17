package proxy;


/**
 * 动态代理的执行流程 开发动态代理对象
 */
public class Test {
    public static void main(String[] args) {
        Star s = new Star("杨超越");
        Skill s2 = StarAgent.getProxy(s);
        s2.jump();
        s2.sing();
    }
}
