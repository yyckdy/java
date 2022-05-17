package decoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        InputStream is = new BufferInputStream(new FileInputStream());
        is.read(new byte[1024]);
        is.read();
    }
}
