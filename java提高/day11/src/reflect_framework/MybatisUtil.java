package reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {

    public static void save(Object o) {
        try (PrintStream pr = new PrintStream(new FileOutputStream("/Users/yy/IdeaProjects/java/java提高/day11/src/data.txt", true));) {

            Class c = o.getClass();
            pr.println("==========" + c.getSimpleName() + "==========");//获取当前类名

            Field[] fields = c.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                String value = field.get(o).toString();
                pr.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
