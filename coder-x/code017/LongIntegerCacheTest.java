package code017;

public class LongIntegerCacheTest {

    public static void main(String[] args) {

        Long a = 127L;
        Long b = 127L;
        System.out.println("a == b " + (a == b));  // a == b true

        Long a1 = 128L;
        Long b1 = 128L;
        System.out.println("a == b " + (a1 == b1));  // a == b false

        Long a2 = -128L;
        Long b2 = -128L;
        System.out.println("a == b " + (a2 == b2));  // a == b true

    }

}
