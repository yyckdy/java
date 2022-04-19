package map_traversal;

import javax.sql.rowset.spi.SyncResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("娃娃", 20);
        maps.put("iPhoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);

        //entrySet把map集合转换为set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("--------------------");
        maps.forEach((k, v) -> {
            System.out.println(k + "->" + v);
        });
    }
}
