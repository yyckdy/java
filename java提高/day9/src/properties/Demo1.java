package properties;

import java.io.FileReader;
import java.util.Properties;

/**
 * 属性
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
//        properties.setProperty("admin1", "123456");
//        properties.setProperty("admin2", "1234567");
//        properties.setProperty("admin3", "12345678");
//        System.out.println(properties);
//        properties.store(new FileWriter("java/java提高/day9/src/user.properties"), "");

        //读取
        //加载
        properties.load(new FileReader("java/java提高/day9/src/user.properties"));
//        System.out.println(properties);
        String admin1 = (String) properties.get("admin1");
        String admin2 = properties.getProperty("admin2");
        System.out.println(admin1);
        System.out.println(admin2);

    }
}
