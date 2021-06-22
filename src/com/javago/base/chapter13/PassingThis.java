package com.javago.base.chapter13;

class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
        System.out.println(peeled.getPeeled());  // 同一引用
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        // ... remove peel
        System.out.println(apple);  // 同一引用
        return apple; // Peeled
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);  // Peeler.peel(Apple object) > object
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
