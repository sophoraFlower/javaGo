package com.javago.base.chapter4;

public class ParamTest {

    public static void test() {
        System.out.println("no param");
    }

    public static void calculate(int a, int b){
        System.out.println("number a = " + a);
        System.out.println("number b = " + b);
    }

    public static void test2(Student student) {
        System.out.println(student.getAge());  // 18
        System.out.println(student.getName());  // 王大锤
    }

    public static void main(String[] args) {
        test();
        ParamTest.calculate(3, 7);
        Student s = new Student();
        s.setAge(18);
        s.setName("王大锤");
        test2(s);
    }
}
