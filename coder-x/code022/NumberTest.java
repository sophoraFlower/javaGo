package code022;

public class NumberTest {

    public static void main(String[] args) {
        Integer integer = new Integer("666");
        double a = integer.doubleValue();
        System.out.println(a);
        int b = integer.compareTo(666);
        System.out.println(b);
        boolean c = integer.equals(666);
        System.out.println(c);
        System.out.println(integer);  // 会调用tostring()
        Integer d = Integer.valueOf("666");
        System.out.println(d);
        int e = Integer.parseInt("666");
        System.out.println(e);
    }

}
