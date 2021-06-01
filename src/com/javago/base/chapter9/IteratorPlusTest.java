package com.javago.base.chapter9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPlusTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Iterator<String> iterator = list.iterator();

        while ( iterator.hasNext() ){
            String str = iterator.next();
            if (str.equals("3")) {
                // list.remove(str);  // ConcurrentModificationException ❌
                iterator.remove();  // 无报错， ✅
            }
            System.out.println(str);
        }
        System.out.println(list);  // [1, 2, 4, 5]
    }

}
