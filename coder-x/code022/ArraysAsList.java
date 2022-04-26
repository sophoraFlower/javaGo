package code022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {
        String[] arg1 = {"a", "b"};
        String[] arg2 = new String[2];
        arg2[0] = "a";
        arg2[1] = "b";

        // 两种推荐的遍历方式:forEach和函数式接口
        for (String str: arg1
             ) {
            System.out.println(str);
        }
        Arrays.asList(arg2).stream().forEach(x -> System.out.println(x));
        Arrays.asList(arg2).forEach(System.out::println);

        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        List<String> stringList = Arrays.asList(stringArray);
        stringList.set(0, "one_");
        System.out.println(stringArray[0]);  // one_

        // stringList.add("four");  // UnsupportedOperationException
        // stringList.remove(2);  // UnsupportedOperationException
        // stringList.clear();  // UnsupportedOperationException

        // 创建新集合，以Arrays.asList返回的不可变集合为参数
        List<Object> objectList = new ArrayList<Object>(stringList);
        System.out.println(objectList);  // [one_, two, three]

    }

}
