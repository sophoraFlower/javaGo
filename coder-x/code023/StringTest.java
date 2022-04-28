package code023;

public class StringTest {

    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = a;
        if (a.equals(b)) {
            System.out.println("a == b");
        }
        if (b.equals(c)) {
            System.out.println("b == c");
        }
        String d = new String("hello");
        String e = new String("hello");

        System.out.println(a == d);  // false
        System.out.println(d == e);  // false
        System.out.println(a.equals(d));  // true
        System.out.println(d.equals(e));  // true

        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);  // runoob

        System.out.println(helloString.length());  // 6
        System.out.println("hello " + helloString);  // hello runoob
        System.out.println("hello ".concat(helloString));  // hello runoob

        String str = String.format("hello %s", helloString);
        System.out.println(str);
    }

}
