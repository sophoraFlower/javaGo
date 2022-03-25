package code011.todo06;

public interface Inter {

    void show();  // 抽象方法
    // default 方法
    default void defaultShow(){
        System.out.println("default 方法");
    }
    // 静态方法
    static void staticShow(){
        System.out.println("静态方法");
    }

}
