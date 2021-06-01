package com.javago.base.chapter8;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(6);
        System.out.println(hashSet);  // [1, 2, 3, 4, 5, 6]
        System.out.println(hashSet.size());  // 6
    }

}
