package pattern;

public class FactorPattern {
    /*
    定义一个方法创建对象
     */
    public static Computer createComputer(String info) {
        switch (info) {
            case "Huawei":
                Computer c = new Huawei();
                c.setName("Huawei");
                c.setPrice(5999);
                return c;
            case "mac":
                Computer c2 = new Mac();
                c2.setName("Mac");
                c2.setPrice(11999);
                return c2;
            default:
                return null;
        }
    }
}
