package com.javago.base.chapter5;

public class ForTest {

    public static void test() {
        String [] array = {"monkey", "dog", "cat", "tiger"};
        for(String animal : array){
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
