package com.javago.base.chapter8;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("danny");

        System.out.println(arrayList);  // [jack, tom, danny]
        System.out.println(arrayList.get(1));  // tom
        arrayList.set(1, "tommy");
        int size = arrayList.size();  // 3
        System.out.println(size);
        System.out.println(arrayList);  // [jack, tommy, danny]
        arrayList.remove(1);
        System.out.println(arrayList);  // [jack, danny]
        arrayList.clear();
        if(arrayList.isEmpty()){
            System.out.println("arrayList is empty~");
        }

    }

}
