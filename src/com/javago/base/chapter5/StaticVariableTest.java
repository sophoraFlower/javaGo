package com.javago.base.chapter5;

public class StaticVariableTest {

    public static void main(String[] args) {

        System.out.println(Student.age);  // 20
        Student student0 = new Student();
        student0.name = "王大锤";
        System.out.println(student0.name);  // 王大锤
        System.out.println(student0.age);  // 20

        Student student1 = new Student();
        student1.name = "王大锤";
        student1.age = 16;

        Student student2 = new Student();
        student2.name = "王二锤";
        student2.age = 17;

        Student student3 = new Student();
        student3.name = "王三锤";
        student3.age = 18;

        System.out.println(student1.name);  // 王大锤
        System.out.println(student2.name);  // 王二锤
        System.out.println(student3.name);  // 王三锤

        System.out.println(student1.age);  // 18
        System.out.println(student2.age);  // 18
        System.out.println(student3.age);  // 18

        System.out.println(Student.age);  // 18

        student0.waiting();  // I am waiting!
        Student.sleep();  // I am sleeping!
    }
}
