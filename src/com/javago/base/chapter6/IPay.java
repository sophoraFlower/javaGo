package com.javago.base.chapter6;

public interface IPay {
    // static修饰符定义的静态方法
    static void staticMethod(){
        System.out.println("接口中的静态方法");
    }

    // default修饰符定义默认方法，默认方法不是抽象方法,可重写也可不重写
    default void defaultMethod(){
        System.out.println("接口中的默认方法");
    }
}