package com.javago.base.chapter4;

public class VariableTypeTest {
    // 类变量
    public static String NAME;
    public static int AGE;
    public static boolean FLAG;

    public static void add() {
        System.out.println(NAME);  // null
        System.out.println(VariableTypeTest.NAME);  // null
    }

    public static void main(String[] args) {

        System.out.println(NAME);  // null
        System.out.println(AGE);  // 0
        System.out.println(FLAG);  // false
        add();

        Student student = new Student();
        student.setName("王大锤");
        System.out.println(Student.PREFIX + student.getName());  // 我是王大锤
    }
}
