package com.javago.base.chapter9;

import java.util.Objects;

public class ObjectsTest {

    public static void main(String[] args) {
        String str1 = "java project";
        String str2 = "java project.";
        String [] arr1 = {"aa", "bb", "cc"};
        String [] arr2 = {"aa", "bb", "cc"};
        System.out.println(Objects.equals(str1, str2));  // false
        System.out.println(Objects.equals(arr1, arr2));  // false
        System.out.println(Objects.deepEquals(arr1, arr2));  // true
        System.out.println(Objects.hashCode("java"));  // 3254818
        System.out.println(Objects.hash("a", "b", "c"));  // 126145
    }

}
