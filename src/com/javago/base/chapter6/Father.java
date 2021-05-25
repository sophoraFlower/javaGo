package com.javago.base.chapter6;

public class Father {

    static {
        System.out.println("父类静态代码块");
    }

    public Father(){
        System.out.println("father 无参构造函数");
    }

    public Father(int age){
        System.out.println("father 有参构造函数");
    }

    public void sleep(){
        System.out.println("父类sleep方法");
    }
}
