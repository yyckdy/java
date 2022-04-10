package abstract_demo7;

public class Test {
    public static void main(String[] args) {
        GoldCard  goldCard=new GoldCard();
        goldCard.setMoney(10000);
        goldCard.setName("yy");
        goldCard.pay(goldCard.getMoney());
    }
}
