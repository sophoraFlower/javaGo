package code001;

public class BitShift {

    public static void main(String[] args) {
        int a = 0x400;
        System.out.println(a);  // 1042
        System.out.println(a >> 1);  // 512
        System.out.println(a >> 2);  // 256
        System.out.println(a << 1);  // 2048
        System.out.println(a << 2);  // 4096

        int b = -0x400;
        System.out.println(b);  // -1024
        System.out.println(b >> 1);  // -512
        System.out.println(b >> 2);  // -256
        System.out.println(b << 1);  // -2048
        System.out.println(b << 2);  // -4096

        System.out.println(b >>> 1);  // 2147483136
        System.out.println(b >>> 2);  // 1073741568
    }

}
