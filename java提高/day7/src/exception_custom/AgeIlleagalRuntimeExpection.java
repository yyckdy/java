package exception_custom;

/**
 * 自定义编译时异常
 */
public class AgeIlleagalRuntimeExpection extends RuntimeException{
    public AgeIlleagalRuntimeExpection() {
    }

    public AgeIlleagalRuntimeExpection(String message) {
        super(message);
    }
}
