package map_test;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
统计投票人数
 */
public class Test1 {
    public static void main(String[] args) {
        //把80个学生选择的数据拿进来
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[random.nextInt(selects.length)]);
        }
        //定义一个map集合记录最终统计结果
        Map<Character, Integer> infos = new HashMap<>();
        //遍历
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (infos.containsKey(ch)) {
                infos.put(ch, infos.get(ch) + 1);
            } else {
                infos.put(ch,1);
            }
        }
        System.out.println(infos);
    }
}
