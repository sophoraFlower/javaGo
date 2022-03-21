package code001;

public class Analysis02 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        a++;
        b = b++;
        c = c++;
        System.out.println(a);  // 1
        System.out.println(b);  // 0
        System.out.println(c);  // 0
        c = c++;
        System.out.println(c);  // 0
        d = ++d;
        System.out.println(d);  // 1
        d = ++d;
        System.out.println(d);  // 2
    }

}
