package static_demo3;

import java.util.ArrayList;

public class StaticTest3 {
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] size = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♥️", "♠️", "♦️", "♣️"};
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(size[i]+colors[j]);
            }
        }
        cards.add("小🃏");
        cards.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("新牌："+cards);
    }
}
