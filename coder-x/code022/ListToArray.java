package code022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("one");
        list.add("two");
        list.add("three");

        String[] array = new String[3];
        list.toArray(array);
        System.out.println(Arrays.toString(array));  // [one, two, three]
        System.out.println(Arrays.asList(array));  // [one, two, three]

    }

}
