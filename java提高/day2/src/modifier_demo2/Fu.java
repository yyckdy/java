package modifier_demo2;

public class Fu {
    //本类访问
    private void privateMethod(){
        System.out.println("----privateMethod----");
    }
    //本类和同包下其他类
    void method(){
        System.out.println("------缺省-------");
    }

    //本类，同包的其他类，其他包的子类
    protected void protectedMethod(){
        System.out.println("-----protected------");
    }
    //all
    public void publicMethod(){
        System.out.println("------public------");
    }

    public static void main(String[] args) {
        Fu f=new Fu();
        f.privateMethod();
        f.method();
        f.publicMethod();
        f.publicMethod();
    }

}
