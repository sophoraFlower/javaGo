package code023;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringFunctionTest {

    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "adhfyrs";
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'r', 'u', 'n', 'o', 'o', 'b'};

        System.out.println(str1.charAt(3));  // d
        System.out.println(str1.compareTo(str2));  // -2
        System.out.println(str1.concat(str2));  // abcdefgadhfyrs
        System.out.println(str1.contentEquals("abcdefg"));  // true
        System.out.println(String.copyValueOf(Str1, 1, 5));  // ello
        System.out.println(str1.endsWith("efg"));  // true
        System.out.println(str1.equals(str2));  // false
        byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);
        for (byte c: bytes
             ) {
            System.out.println(c);  // 97、98、99、100、102、103
        }
        char[] chars = new char[5];
        str1.getChars(0, 5, chars, 0);
        System.out.println(Arrays.toString(chars));  // [a, b, c, d, e]
        System.out.println(str1.hashCode());  // -1206291356
        System.out.println(str1.indexOf("c"));  // 2
        System.out.println(str1.lastIndexOf("c"));  // 2
        System.out.println(Arrays.toString(str1.split("")));  // [a, b, c, d, e, f, g]
        System.out.println(str1.substring(2, 4));  // cd
    }

}
