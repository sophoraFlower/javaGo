package com.javago.base.chapter4;

public class HeapStackTest {
    public static void main(String[] args) {
        // 基本数据类型
        int age = 10;
        int age2 = 12;
        age2 = age;
        System.out.println(age);  // 10
        System.out.println(age2);  // 10
        age = 18;
        System.out.println(age);  // 18
        System.out.println(age2);  // 10

        // 引用数据类型
        String a = "小D课堂Java架构";
        String b = "I live java";
        System.out.println(a);
        System.out.println(b);

        b = a;
        System.out.println(a);
        System.out.println(b);

        a = "小D课堂Java基础";
        System.out.println(a);
        System.out.println(b);

        // 数组拷贝
        int [] c = {1, 2, 3};
        int [] d = c;
        System.out.println(c);  // [I@29453f44
        System.out.println(d);  // [I@29453f44

        d[0] = 0;
        System.out.println(c);  // [I@29453f44
        System.out.println(d);  // [I@29453f44
        System.out.println(d[0] == c[0]);  // true
    }
}
