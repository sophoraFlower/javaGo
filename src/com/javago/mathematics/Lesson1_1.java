package com.javago.mathematics;
import java.math.BigInteger;

public class Lesson1_1 {

    public static String decimalToBinary(int decimalSource){
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        return bi.toString(2);
    }

    public static int binaryToDecimal(String binarySource){
        BigInteger bi = new BigInteger(binarySource, 2);
        return Integer.parseInt(bi.toString());
    }

    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        System.out.println(String.format("数字%d的二进制是%s", a, Lesson1_1.decimalToBinary(a)));
        System.out.println(String.format("数字%s的十进制是%d", b, Lesson1_1.binaryToDecimal(b)));
    }
}

