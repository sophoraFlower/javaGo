package com.javago.base.chapter6;

public class Dog extends Animals{
    private int weight;
    public void eat(){
        System.out.println("dog eating bone!");
    }

    @Override
    public void sleep(){
        System.out.println("a dog is sleeping!");
    }
}
