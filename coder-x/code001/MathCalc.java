package code001;

public class MathCalc {

    public static void main(String[] args) {
        System.out.println(5+6);  // 11
        System.out.println(5-6);  // -1
        System.out.println(5*6);  // 30
        // 结果为无限循环
        System.out.println(5/6.0);  // 0.8333333333333334
        System.out.println(1+2-3*4/5.0);  // 0.6000000000000001
        System.out.println((1+2+3)*4/5.0);  // 4.8
    }

}
