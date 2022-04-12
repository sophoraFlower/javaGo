package code018;

public class Constant {

    public static final String GLOBAL_CONSTANT = "shared in globals";
    private static final String CLASS_CONSTANT = "shared in class";

    public void f(String a) {
        final String methodConstant = "shared in method";
    }

    public void g(final int b) {
        // 编译出错，不允许对常量参数进行重新赋值
        // b = 3;
    }
}
