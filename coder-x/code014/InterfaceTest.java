package code014;

public interface InterfaceTest {

    // 变量默认为public static final，必须被初始化
    public String param_01 = null;
    public static final String param_02 = null;

    public abstract void method_01();
    default void method_02(){
        System.out.println("default method~");
    }

}
