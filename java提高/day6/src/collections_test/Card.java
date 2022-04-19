package collections_test;

public class Card {
    private String size;
    private String color;
    private int index;//牌的真正大小

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return size + color;
    }

    public String getSize() {
        return size;
    }

    public int getIndex() {
        return index;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
