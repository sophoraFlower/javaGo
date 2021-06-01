package com.javago.base.chapter8;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ming", "辅助");
        hashMap.put("gala", "ADC");
        hashMap.put("wei", "打野");

        System.out.println(hashMap.get("gala"));  // ADC
        System.out.println(hashMap.containsKey("gala"));  // true
        System.out.println(hashMap.size());  // 3
        System.out.println(hashMap.keySet());  // [ming, wei, gala]
        System.out.println(hashMap.values());  // [辅助, 打野, ADC]
    }

}
