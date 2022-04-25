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

        Integer i1 = 200;
        Integer i2 = 200;
        System.out.println(i1 == i2);  // false
        System.out.println(i1.equals(i2));  // true

        Integer i3 = 20;
        Integer i4 = 20;
        System.out.println(i3 == i4);  // true
        System.out.println(i3.equals(i4));  // true

        // 非 new 生成的 Integer 变量与 new Integer() 生成的变量比较
        Integer i5 = 20;
        Integer i6 = new Integer(20);
        System.out.println(i5 == i6);  // false
        System.out.println(i5.equals(i6));  // true

        // java 在编译 Integer i1 = 127 时，会翻译成 Integer i1 = Integer.valueOf(127)
        // Integer 变量(无论是否是 new 生成的)与 int 变量比较，只要两个变量的值是相等的，结果都为 true
        Integer i7 = 200;
        Integer i8 = new Integer(200);
        int j = 200;
        System.out.println(i7 == j);  // 输出：true
        System.out.println(i8 == j);  // 输出：true

    }

}
