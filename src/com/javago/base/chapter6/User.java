package com.javago.base.chapter6;

/**
 * 一个类里边可以有多个构造函数：默认构造函数、无参构造函数、有参构造函数
 * 构造函数，相当于对象的初始化
 */
public class User {

    private int age;
    private int height;
    private String name;

    // public User(){
        // 默认构造函数～
    // }

    // 无参构造函数
    public User(){
        this.age = 18;
    }

    // 有参构造函数
    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    // 重载
    public void sleep(String address){
        System.out.println("I am sleeping on the " + address);
    }

}
