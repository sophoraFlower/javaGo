package ObjectContainer;

import java.util.ArrayList;

class Value{
    private int i;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}

public class NoteBook {

    // 泛型类，容器
    private ArrayList<String> notes = new ArrayList<String>();
    // private int size = 0;

    public void add(String s){
        notes.add(s);
        // size++;
    }

    public void add(String s, int location){
        notes.add(location, s);
    }

    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String[] list(){
        String[] a = new String[notes.size()];
        for(int i=0; i<notes.size(); i++){
            a[i] = notes.get(i);
        }
        // notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
//        String[] a = new String[2];
//        a[0] = "first";
//        a[1] = "second";
//        System.out.println(a.length);
//        System.out.println(a[0]);
//        NoteBook noteBook = new NoteBook();
//        noteBook.add("first");
//        noteBook.add("second");
//        noteBook.add("third", 1);
//        System.out.println(noteBook.getSize());
//        noteBook.removeNote(1);
//        String[] l = noteBook.list();
//        for(String s : l){
//            System.out.println(s);
//        }

        int[] ia = new int[10];
        String[] sa = new String[10];
        System.out.println(ia[0]);
        System.out.println(sa[0]);
        for (int i=0; i<sa.length; i++){
            sa[i] = ""+i;
        }
        System.out.println(sa[2]);
        System.out.println(sa[2].length());

        Value[] value = new Value[10];
        for(int i=0; i< value.length; i++){
            value[i] = new Value();
            value[i].setI(i);
        }

        for(Value v : value){
            System.out.println(v.getI());  // i
            v.setI(0);
            System.out.println(v.getI());  // 0
        }

        for(Value v : value){
            System.out.println(v.getI());  // 0
        }
    }

}
