package code022;

public class IntegerTest {

    public static void main(String[] args) {
        Integer x = 5;  // 装箱
        int y = 5;
        x = x + 5;  // 拆箱
        y = y + 5;
        System.out.println(x);
        System.out.println(y);

    }

}
