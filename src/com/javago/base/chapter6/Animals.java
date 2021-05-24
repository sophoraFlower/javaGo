package com.javago.base.chapter6;

public class Animals {
    // private修饰的类子类不可访问和赋值
    private String name;
    private int age;
    // public修饰的属性子类可正常访问和赋值
    public String property;

    // private修饰的类，不可被继承和访问
    private void isAnimate(){
        System.out.println("isAnimate of private function!");
    }

    // final关键字修饰的方法，可正常继承，但不允许重写
    public final void run(){
        System.out.println("animal run~");
    }

    public void sleep(){
        System.out.println("sleeping!");
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
}
