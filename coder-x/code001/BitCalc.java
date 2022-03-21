package code001;

public class BitCalc {

    public static void main(String[] args) {
        int a = 0xF8;  // 二进制：1111 1000
        int b = 0xF4;  // 二进制：1111 0100
        int c = 0xFF;  // 二进制：1111 1111
        System.out.println(a + " " + b + " " + c);  // 248 244 255
        System.out.println(a & b);  // 240 > 1111 0000
        System.out.println(a | b);  // 252 > 1111 1100
        System.out.println(a ^ b);  // 12  > 0000 1100
        System.out.println(~c);  // -256  > 0000 00

        System.out.println(Integer.parseInt(String.valueOf(11110000),2));
        System.out.println(Integer.parseInt(String.valueOf(11111100),2));
        System.out.println(Integer.parseInt(String.valueOf(1100),2));
        System.out.println(Integer.parseInt(String.valueOf(-100000000),2));
    }

}