package decoratorPattern;

//装饰类 拓展原始类的功能
public class BufferInputStream extends InputStream {
    private InputStream is;

    public BufferInputStream(InputStream is) {
        this.is = is;
    }

    @Override
    public int read() {
        System.out.println("提供8kb的缓冲区提高读写性能");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb的缓冲区提高读写性能");
        return is.read(buffer);
    }
}
