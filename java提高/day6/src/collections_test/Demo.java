package collections_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    /**
     * 定义一个静态集合存储54张牌对象
     */
    public static ArrayList<Card> cards = new ArrayList<>();

    /*
     做牌：定义静态代码块初始化牌数据
     */
    static {
        //点数确定，类型确实
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠️", "♥️", "♦️", "♣️"};
        //组合点数和花色
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                cards.add(new Card(size, color, index));
            }
        }
        cards.add(new Card("", "🃏", ++index));
        cards.add(new Card("", "🃏", ++index));
        System.out.println("新牌:" + cards);
    }


    public static void main(String[] args) {
        //洗牌
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);

        //发牌 定义三个玩家
        List<Card> linhuchong = new ArrayList<>();
        List<Card> jiumozhi = new ArrayList<>();
        List<Card> renyinyin = new ArrayList<>();
        //发牌 从牌集合中发出51张
        for (int i = 0; i < cards.size() - 3; i++) {
            switch (i % 3) {
                case 1 -> linhuchong.add(cards.get(i));
                case 2 -> jiumozhi.add(cards.get(i));
                case 0 -> renyinyin.add(cards.get(i));
            }
        }
        //拿到最后三张底牌 截取最后三张牌作为一个子集合
        List<Card> lastThreeCards = cards.subList(cards.size() - 3, cards.size());
        //给玩家的牌排序
        sortCards(linhuchong);
        sortCards(jiumozhi);
        sortCards(renyinyin);
        //输出玩家的牌
        System.out.println("--------------------");
        System.out.println("linhuchong:" + linhuchong);
        System.out.println("jiumozhi:" + jiumozhi);
        System.out.println("renyinyin:" + renyinyin);
        System.out.println("底牌" + lastThreeCards);

    }

    /**
     * 给牌排序
     */
    public static void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o1.getIndex() - o2.getIndex());
    }
}
