package com.javago.base.chapter8;

import java.util.LinkedList;

public class LinkedLIstTest {

    public static void main(String[] args) {

        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("tom");
        linkList.add("kik");
        linkList.add("danny");

        System.out.println(linkList);  // [tom, kik, danny]
        System.out.println(linkList.getLast());  // danny
        System.out.println(linkList.removeLast());  // danny
        System.out.println(linkList);  // [tom, kik]
    }
}
