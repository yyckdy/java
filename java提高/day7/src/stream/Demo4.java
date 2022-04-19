package stream;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo4 {
    public static double allMoney = 0;

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        two.add(new Employee("武大郎", '女', 20000, 0, "下毒"));

        Topperformer t = one.stream().max(((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())))
                .map(e -> new Topperformer(e.getName(), e.getBonus() + e.getSalary())).get();
        System.out.println(t);

        one.stream().sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()))
                .skip(1).limit(one.size() - 2).forEach(e -> {
                    //求出总和
                    allMoney += e.getBonus() + e.getSalary();
                });
        System.out.println("平均为：" + allMoney / (one.size() - 2));
        allMoney = 0;

        Stream.concat(one.stream(), two.stream()).sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getBonus() + o2.getSalary()))
                .skip(1).limit(one.size() + two.size() - 2).forEach(e -> {
                    allMoney += e.getBonus() + e.getSalary();
                });
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println(a.divide(b, 2, RoundingMode.HALF_UP));


    }

}
