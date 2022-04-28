package code023;

public class NumberTest {

    public static void main(String[] args) {
        int a = 10;
        // b指向常量池中的对象
        Integer b = 10;
        Integer b1 = new Integer(10);
        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a != b");
        }

        if (b == b1) {
            System.out.println("b = b1");
        } else {
            System.out.println("b != b1");
        }

        Integer c = 12;
        Integer d = 12;
        if (c == d) {
            System.out.println("c = d");
        } else {
            System.out.println("c != d");
        }

        Integer c1 = 128;
        Integer d1 = 128;
        if (c1 == d1) {
            System.out.println("c1 = d1");
        } else {
            System.out.println("c1 != d1");
        }

        int i1 = 6;
        // Integer i2 = Integer.valueOf(i1);
        Integer i2 = i1;  // 自动装箱，执行Integer.valueOf(i1)或new Integer(i1)
        // Integer i3 = new Integer(i1);
        // int i4 = i2.intValue();
        int i4 = i2;  // 自动拆箱，执行i2.intValue()

        Integer x = 5;
        x =  x + 10;
        System.out.println(x);

    }

}
