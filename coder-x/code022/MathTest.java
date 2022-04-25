package code022;

public class MathTest {

    public static void main(String[] args) {
        double[] doubleArray = new double[5];
        doubleArray[0] = 2.1;
        doubleArray[1] = 2.4;
        doubleArray[2] = 2.5;
        doubleArray[3] = 2.8;
        doubleArray[4] = 3.0;

        for (double d: doubleArray) {
            System.out.println(Math.ceil(d));
            System.out.println(Math.floor(d));
            System.out.println(Math.rint(d));
            System.out.println(Math.round(d));
            // 其他略
        }

        System.out.println(Math.round(2.3));  // 2
        System.out.println(Math.round(2.5));  // 3
        System.out.println(Math.round(2.8));  // 3
        System.out.println(Math.round(-2.3));  // -2
        System.out.println(Math.round(-2.5));  // -2
        System.out.println(Math.round(-2.8));  // -3

        System.out.println(Math.rint(2.3));  // 2.0
        System.out.println(Math.rint(2.5));  // 2.0
        System.out.println(Math.rint(2.8));  // 3.0
        System.out.println(Math.rint(-2.3));  // -2.0
        System.out.println(Math.rint(-2.5));  // -2.0
        System.out.println(Math.rint(-2.8));  // -3.0
    }

}
