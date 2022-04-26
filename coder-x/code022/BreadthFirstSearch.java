package code022;

import java.util.ArrayList;
import java.util.HashMap;

public class BreadthFirstSearch {

    private Boolean breadthFirstSearch(HashMap<String, ArrayList<String>> graph){
        // TO DO 双向链表
         return false;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList01 = new ArrayList<>();
        arrayList01.add("alice");
        arrayList01.add("bob");
        arrayList01.add("claire");

        ArrayList<String> arrayList02 = new ArrayList<>();
        arrayList02.add("anuj");
        arrayList02.add("peggy");

        ArrayList<String> arrayList03 = new ArrayList<>();
        arrayList03.add("peggy");

        ArrayList<String> arrayList04 = new ArrayList<>();
        arrayList04.add("thom");
        arrayList04.add("jonny");

        ArrayList<String> arrayList = new ArrayList<>();

        HashMap<String, ArrayList<String>> Graph = new HashMap<String, ArrayList<String>>();
        Graph.put(new String("you"), new ArrayList<>(arrayList01));
        Graph.put(new String("bob"), new ArrayList<>(arrayList02));
        Graph.put(new String("alice"), new ArrayList<>(arrayList03));
        Graph.put(new String("claire"), new ArrayList<>(arrayList04));
        Graph.put(new String("anuj"), new ArrayList<>(arrayList));
        Graph.put(new String("peggy"), new ArrayList<>(arrayList));
        Graph.put(new String("thom"), new ArrayList<>(arrayList));
        Graph.put(new String("jonny"), new ArrayList<>(arrayList));

        System.out.println(Graph);

    }

}
