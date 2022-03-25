package code013.todo03.learncollection;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> sites = new HashMap<>();
        sites.put(1, "Google");
        sites.put(2, "Runoob");
        sites.put(3, "Taobao");
        sites.put(4, "Zhihu");
        System.out.println(sites);  // {1=Google, 2=Runoob, 3=Taobao, 4=Zhihu}

        System.out.println(sites.get(1));
        sites.remove(1);

        System.out.println(sites.size());

        for (Integer inter: sites.keySet()) {
            System.out.println("sites`s key " + inter);
        }

        for (String str: sites.values()) {
            System.out.println("sites`s value " + str);
        }
    }

}
