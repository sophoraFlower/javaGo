package com.javago.base.chapter5;

public class Student {

    // 成员变量
    String name = "王锤子";
    // 静态变量
    static int age = 20;

    // 静态方法
    public static void sleep() {
        System.out.println("I am sleeping!");
        // 不可访问非static修饰的变量和方法
        // waiting(); error!
        // name error!
        // 可以访问static修饰的变量
        age = 21;
        System.out.println(age);  // 21
    }

    // 成员方法
    public void waiting(){
        System.out.println("I am waiting!");
        // 可以访问static修饰的变量和方法
        age = 22;
        System.out.println(age);  // 22
        sleep();
    }
}
