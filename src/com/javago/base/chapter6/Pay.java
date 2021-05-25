package com.javago.base.chapter6;

public interface Pay extends A, B{

    // 相当于public static final int money = 10;
    int money = 10;
    // 默认即为public abstract boolean getOrderAmount();
    boolean getOrderAmount();
}
