package static_SingleInstance;

/**
 * 饿汉单例实现单例
 */
public class SingleInstance {
    public static SingleInstance instance = new SingleInstance();

    private SingleInstance() {
    }

    ;
}
