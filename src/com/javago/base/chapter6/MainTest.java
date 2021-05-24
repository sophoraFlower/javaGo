package com.javago.base.chapter6;

public class MainTest {

    public static void main(String[] args) {

        User user01 = new User();
        user01.setName("王大锤");
        user01.setAge(20);

        User user02 = new User("王小锤", 28);

        System.out.println(user01.getName());  // 王大锤
        System.out.print(user01.getAge() + "\n");  // 20
        System.out.println(user02.getName());  // 王小锤
        System.out.print(user02.getAge() + "\n");  // 28

        user01.sleep();  // I am sleeping
        user01.sleep("desk");  // I am sleeping on the desk

    }
}
