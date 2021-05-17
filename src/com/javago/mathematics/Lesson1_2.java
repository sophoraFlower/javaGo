package com.javago.mathematics;

public class Lesson1_2 {
    public static int leftShift(int num, int m){
        return num << m;
    }

    public static int rightShift(int num, int m){
        return num >>> m;
    }

    public static int rightShiftPlus(int num, int m){
        return num >> m;
    }

    public static void main(String[] args) {
        int num = 53;
        int num_1 = -53;
        int m = 1;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));
        System.out.println();
        m = 3;
        System.out.println(String.format("数字%d的二进制向左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));
        System.out.println(String.format("数字%d的二进制向右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));
        System.out.println();
        // 逻辑右移
        System.out.println(String.format("数字%d的二进制向逻辑右移%d位是%d", num, m, Lesson1_2.rightShift(num_1, m)));
        // 算数右移
        System.out.println(String.format("数字%d的二进制向算数右移%d位是%d", num, m, Lesson1_2.rightShiftPlus(num_1, m)));
    }
}