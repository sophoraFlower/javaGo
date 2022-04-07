package code016;

public class OuterClass {

    // 成员内部类
    private class InstanceInnerClass {}

    // 静态内部类
    static class StaticInnerClass {}

    public static void main(String[] args) {
        // 匿名内部类
        (new Thread() {}).start();
        (new Thread() {}).start();
        // 局部内部类
        class MethodClass1 {}
        class MethodClass2 {}
    }

}
