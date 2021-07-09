package com.example.webdemo2;

public class Student {
    private String sid;
    private String name;
    private int age;
    private boolean married;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    // 只读
    public String getName() {
        return name;
    }

    // 只写
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    // 只读
    public void getInfo() {
        System.out.println("我是一个学生～");
    }
}