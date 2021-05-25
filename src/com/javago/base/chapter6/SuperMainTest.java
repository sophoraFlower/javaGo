package com.javago.base.chapter6;

public class SuperMainTest {

    public static void main(String[] args) {

        /**
         * output:
         * 父类静态代码块
         * 子类静态代码块
         * father 无参构造函数
         * child 无参构造函数
         * 子类sleep方法
         */
        new Children().sleep();

    }
}
