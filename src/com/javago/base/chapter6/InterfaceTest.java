package com.javago.base.chapter6;

public class InterfaceTest implements A, B, Pay, IPay{
    @Override
    public boolean getOrderAmount() {
        return false;
    }

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    // 可重写，也可不重写
    // @Override
    // public void defaultMethod() {
    //    IPay.super.defaultMethod();
    // }

    public static void main(String[] args) {
        // 接口中的静态方法可直接调用
        IPay.staticMethod();  // 接口中的静态方法
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.defaultMethod();  // 接口中的默认方法
    }
}

