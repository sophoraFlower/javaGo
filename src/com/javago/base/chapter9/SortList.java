package com.javago.base.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("a1");
        list.add("c1");
        System.out.println(list);  // [aa, bb, cc, a1, c1]
        Collections.sort(list);
        System.out.println(list);  // [a1, aa, bb, c1, cc]
        // 默认自然排序
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);  // [a1, aa, bb, c1, cc]
        Collections.sort(list, Comparator.reverseOrder());
        // 降序
        System.out.println(list);  // [cc, c1, bb, aa, a1]
        // 随机排序
        Collections.shuffle(list);
        System.out.println(list);  // [bb, cc, a1, aa, c1] ⚠️ 随机排序，每次输出结果不一样
    }

}
