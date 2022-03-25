package code013.todo03.learncollection;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        sites.add("A");
        sites.add("Z");
        sites.add("N");
        sites.add("l");
        sites.add("s");
        System.out.println(sites);  // [A, s, Z, l, N]

        System.out.println(sites.contains("o"));

        sites.remove("Z");
        System.out.println(sites.size() == 4);

        for (String str: sites) {
            System.out.println(str);
        }


    }

}
