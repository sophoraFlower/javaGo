package code011.todo06;

public class EnumTest {


    enum Color {
        RED, GREEN, BLUE;
    }

    enum Merchandise {
        BOOK, PHONE, VEGETABLE, FRUIT;

        Merchandise() {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void MerchandiseINfo(){
            System.out.println("All merchandise types");
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        System.out.println(c1);

        for(Color c : Color.values()) {
            System.out.println(c);
            System.out.println(c.ordinal());
        }

        System.out.println(Color.valueOf("BLUE"));

        Merchandise merchandise = Merchandise.BOOK;
        merchandise.MerchandiseINfo();

    }

}
