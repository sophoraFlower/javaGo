package com.javago.base.chapter5;

public class Dog {

    private static int age = 10;

    private String name;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Dog.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeAge(){
        Dog.age += 10;
    }
}