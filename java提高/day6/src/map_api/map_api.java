package map_api;

import java.util.*;

public class map_api {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iPhoneX", 10);
        maps.put("娃娃", 20);
        maps.put("iPhoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);

        //清空集合
//        maps.clear();
//        System.out.println(maps);

        System.out.println(maps.isEmpty());
        System.out.println(maps.get("huawei"));

        //根据键删除
        System.out.println(maps.remove("huawei"));
        System.out.println(maps);


        System.out.println(maps.containsKey("手表"));
        System.out.println(maps.containsValue(10000));

        //获取全部键的集合
        Set<String> strings = maps.keySet();
        //获取全部值集合
        Collection<Integer> values = maps.values();

        System.out.println(strings);
        System.out.println(values);

        //集合的大小
        System.out.println(maps.size());

        //合并其他map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java1", 1);
        map1.put("Java2", 100);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Java2", 1);
        map2.put("Java3", 100);
        map1.putAll(map2);
        System.out.println(map1);
    }
}
