package com.javago.base.chapter6;

public class Children extends Father{

    static {
        System.out.println("子类静态代码块");
    }

    public Children(){
        // 写或不写均会默认调用
        super();

        // this和super在构造函数中只能有一个，且都必须是构造函数当中的第一行
        // this(1); error! ❌
        // new Children(18); ✅
        System.out.println("child 无参构造函数");
    }

    public Children(int age){
        System.out.println("child 有参构造函数");
    }

    public void sleep(){
        System.out.println("子类sleep方法");
    }

    // 调用父类的方法
    public void fatherSleep(){
        super.sleep();
    }
}
