package com.javago.base.chapter13;

class A {
    A() {
        System.out.println("@@");
    }
}

public class VarArgs {

    static void printArray(Object[] args) {
        for (Object obj: args) {
            System.out.println(obj + "");
        }
        System.out.println();
    }

    // 可变参数
    static void printVarArray(Object... args) {
        for (Object obj: args) {
            System.out.println(obj + "");
        }
        System.out.println();
    }

    // 可选尾参数
    static void printOptVarArray(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for (String s: trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] {47, 3.14, 11.11});
        printArray(new Object[] {"one", "two", "three"});
        printArray(new Object[] {new A(), new A(), new A()});  // 打印类名和地址

        printVarArray(47, 3.14, 11.11);
        printVarArray("one", "two", "three");
        printVarArray(new A(), new A(), new A());
        printVarArray((Object[]) new Integer[] {1, 2, 3, 4});
        printVarArray();

        printOptVarArray(1, "one");
        printOptVarArray(2, "two", "three");
        printOptVarArray(0);
    }

}
