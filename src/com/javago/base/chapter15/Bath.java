package com.javago.base.chapter15;

/**
 * 初始化的四种方式
 */

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    @Override
    public String toString() {
        return "Soap{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class Bath {
    // 定义对象，在调用构造函数之前完成初始化
    private String
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap surf;
    private int i;
    private float toy;
    public Bath() {
        // 在构造函数中初始化
        System.out.println("Inside Bath()");
        s3 = "Joy";
        surf = new Soap();
        System.out.println(surf);
    }
    // 实例初始化
    { i = 47; }

    @Override
    public String toString() {
        // 延迟初始化，减少开销
        if (s4 == null) {
            s4 = "Joy";
        }
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", surf=" + surf +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
}
