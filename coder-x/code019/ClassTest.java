package code019;

import java.lang.reflect.Field;

public class ClassTest {

    private static int[] array = new int[3];
    private static int length = array.length;

    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception {

        // 通过 newInstance() 方法创建 One 和 Another 的类对象
        One oneObject = one.newInstance();
        oneObject.call();

        Another anotherObject = another.newInstance();
        anotherObject.speak();

        // 通过 one 这个大写的 Class 对象，获取私有成员属性对象Field
        Field privateFieldOne = one.getDeclaredField("inner");
        // 设置私有属性可以访问和修改
        privateFieldOne.setAccessible(true);
        // 修改操作并获取修改后的值
        privateFieldOne.set(oneObject, "world changed.");
        System.out.println(oneObject.getInner());

    }

}

class One {
    private String inner = "time files.";

    public void call() {
        System.out.println("hello world.");
    }

    public String getInner() {
        return inner;
    }
}

class Another {
    public void speak() {
        System.out.println("easy coding.");
    }
}