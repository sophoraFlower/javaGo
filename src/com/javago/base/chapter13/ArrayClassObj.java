package com.javago.base.chapter13;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
    public static void main(String[] args) {
        // 伪随机数
        Random rand = new Random(47);  // java.util.Random@5cad8086
        System.out.println(rand.toString());  // [null, null, null, ..., null]
        Integer[] a = new Integer[rand.nextInt(20)];   // 数组长度在0-20之间
        System.out.println(Arrays.toString(a));
        System.out.println("length of a = " + a.length);  // 18
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500); // Autoboxing
        }
        System.out.println(Arrays.toString(a));  // [55, 193, 361, ..., 20]
    }
}
