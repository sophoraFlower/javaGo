package code017;

public class ParamPassing {

    private static int intStatic = 222;
    private static final String stringStatic = "init String";
    private static final StringBuilder stringBuilderStatic = new StringBuilder("init StringBuilder");

    public static void main(String[] args) {
        // 实参调用
        method(intStatic);
        System.out.println(intStatic);

        method();
        System.out.println(intStatic);

        method(stringStatic);
        System.out.println(stringStatic);

        method(stringBuilderStatic, stringBuilderStatic);

        System.out.println(stringBuilderStatic);
    }

    public static void method(){
        // 此处 intStatic 对应外部的 intStatic
        intStatic = 666;
    }

    public static void method(int intStatic){
        // 此处 intStatic 是局部变量，与外部的静态变量 intStatic 无瓜
        intStatic = 777;
        System.out.println("@@ method(int intStatic) " + intStatic);
    }

    public static void method(String stringStatic) {
        // 此处 stringStatic 是局部变量，与外部的静态变量 stringStatic 无瓜
        stringStatic = "New String";
        System.out.println("@@ method(String stringStatic) " + stringStatic);
    }

    public static void method(StringBuilder stringBuilderStatic1, StringBuilder stringBuilderStatic2) {
        stringBuilderStatic1.append(" .method.first");
        stringBuilderStatic2.append(" .method.second~");
        System.out.println("@@ stringBuilderStatic " + stringBuilderStatic);

        // 引用重新赋值，此时stringBuilderStatic1同局部变量
        stringBuilderStatic1 = new StringBuilder("New stringBuilderStatic1");
        stringBuilderStatic1.append(" new method`s append");
        System.out.println("@@ stringBuilderStatic " + stringBuilderStatic1);
    }

}
