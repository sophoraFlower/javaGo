package code013.todo03.learncollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        // add()
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        // get()
        System.out.println(sites.get(0));
        // set()
        sites.set(0, "Tencent");
        System.out.println(sites);
        // remove()
        sites.remove(2);
        System.out.println(sites);
        // size()
        System.out.println("sites的大小：" + sites.size());
        // contains()
        System.out.println(sites.contains("Weibo"));
        // Collections.sort()
        Collections.sort(sites);  // 字母排序
        System.out.println(sites);

    }

}
