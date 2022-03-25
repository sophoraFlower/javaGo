package code013.todo03.learncollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("A");
        sites.add("B");

        // 获取迭代器
        Iterator<String> it = sites.iterator();
        System.out.println(it);  // java.util.ArrayList$Itr@29453f44

        // 输出集合中的第一个元素
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        // System.out.println(it.next());  // SuchElementException

        Iterator<String> sitesPLusIterator = sites.iterator();
        while(sitesPLusIterator.hasNext()){
            String interator = sitesPLusIterator.next();
            if (interator.equals("Taobao")) {
                sitesPLusIterator.remove();
                System.out.println("#####");
                continue;
            }
            System.out.println(interator);
        }
    }

}
