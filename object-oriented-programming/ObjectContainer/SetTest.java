package ObjectContainer;

import java.util.HashSet;

public class SetTest {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("first");
        hs.add("second");
        hs.add("first");  // 因唯一性，该次add失败
        for(String s : hs){
            System.out.println(s);
        }
        System.out.println(hs);  // [first, second]
    }

}
