package static_SingleInstance;

/**
 * 懒汉单例
 */
public class SingInstance2 {
    private SingInstance2(){};
    public static SingInstance2 instance;

    public static SingInstance2 getInstance(){
        if(instance==null){
            instance=new SingInstance2();
        }
        return instance;
    }
}
