package code001;

public class Analysis01 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        a = a++;
        System.out.println(a);  // 0
        b = a++;
        System.out.println(a);  // 1
        System.out.println(b);  // 0
        // System.out.println(b++);  // 0
        c = b++;
        System.out.println(b);  // 1
        System.out.println(c);  // 0
        d = d++;
        d = d++;
        System.out.println(d);  // 0
        d = ++d;
        d = ++d;
        System.out.println(d);  // 2
        c = a++;
        System.out.println(a);  // 2
        System.out.println(c);  // 1
    }

}
