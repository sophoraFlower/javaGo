package code023;

public class NumberBoxingTest {

    public static void main(String[] args) {
        int a1 = 10;
        int b1 = 10;
        int c1 = 200;

        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 200;
        Integer i4 = 200;

        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        Integer I3 = new Integer(200);
        Integer I4 = new Integer(200);

        System.out.println(a1 == b1);  // true
        System.out.println(a1 == i1);  // 自动拆箱，true
        System.out.println(c1 == i3);  // 自动拆箱，true
        System.out.println(i1 == i2);  // 缓存，true
        System.out.println(i3 == i4);  // 非缓存， false
        System.out.println(a1 == I1);  // 自动拆箱，true
        System.out.println(I1 == I2);  // false
        System.out.println(I3 == I4);  // false
        System.out.println(i1 == I1);  // false
        System.out.println(i3 == I3);  // false

    }

}
