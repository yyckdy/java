package exception_custom;

/**
 * 自定义编译时异常
 */
public class AgeIlleagalExpection extends Exception{
    public AgeIlleagalExpection() {
    }

    public AgeIlleagalExpection(String message) {
        super(message);
    }
}
