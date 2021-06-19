package com.javago.base.chapter13;

public class SimpleConstructor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }

        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }

}

class Rock {
    Rock() { // 这是一个构造器
        System.out.print("Rock ");
    }

    Rock(int i) { // 这是一个构造器
        System.out.print("Rock i= " + i);
    }
}

