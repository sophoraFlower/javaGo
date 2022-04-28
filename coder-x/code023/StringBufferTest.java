package code023;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abcdefg");
        sb.append("h");
        System.out.println(sb);  // abcdefgh
        sb.reverse();
        System.out.println(sb);  // hgfedcba
        sb.delete(0,1);
        System.out.println(sb);  // gfedcba
        sb.insert(3, "#");
        System.out.println(sb);  // gfe#dcba
        sb.replace(0, 2, "@@");
        System.out.println(sb);  // @@e#dcba
    }

}
