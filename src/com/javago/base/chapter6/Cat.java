package com.javago.base.chapter6;

public class Cat extends Animals{
    private int weight;
    public void eat(){
        System.out.println("cat eating mouse!");
    }

    @Override
    public void sleep(){
        System.out.println("a cat is sleeping!");
    }

    // 不可被重写
    // public final void run(){
    //     System.out.println("animal run~");
    // }
}
