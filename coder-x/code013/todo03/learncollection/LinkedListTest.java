package code013.todo03.learncollection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("A");
        sites.add("Z");
        sites.add("N");
        sites.add("l");
        sites.add("s");
        System.out.println(sites);  // [A, Z, N, l, s]

        sites.addFirst("first");
        sites.addLast("last");
        System.out.println(sites);

        sites.removeFirst();
        sites.removeLast();
        System.out.println(sites);

        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());

        for (String str: sites
             ) {
            System.out.println(str);
        }
    }

}
