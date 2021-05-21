package com.javago.base.chapter4;

public class Student {

    public static String PREFIX = "我是";

    private int age;

    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("王大锤");
        student.setAge(28);
        System.out.println(Student.PREFIX + student.getName() + "，我今年" + student.getAge() + "岁" );
    }
}
