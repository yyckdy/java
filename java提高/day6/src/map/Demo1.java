package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 认识map 按照键，无序，不重复，无索引，值不做要求
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建一个map对象
//        Map<String,Integer>maps=new HashMap<>();//无序
        Map<String,Integer>maps=new LinkedHashMap<>();//有序
        maps.put("鸿星尔克",3);
        maps.put("枸杞",100);
        maps.put("Java",1);
        maps.put("Java",100);//覆盖前面的数据
        maps.put(null,null);
        System.out.println(maps);
    }
}
