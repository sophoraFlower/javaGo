package code021;

import java.util.ArrayList;

public class QuickSort {

    private ArrayList<Integer> quickSort (ArrayList<Integer> arrayList){
        int arrayListLength = arrayList.size();
        if(arrayListLength < 2) {
            return arrayList;
        } else {
            int pivot = arrayList.get(0);
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> more = new ArrayList<>();
            for (Integer integer: arrayList.subList(1, arrayListLength)) {
                if(integer <= pivot) {
                    less.add(integer);
                } else {
                    more.add(integer);
                }
            }

            ArrayList<Integer> pilotList = new ArrayList<>();
            pilotList.add(pivot);
            ArrayList<Integer> endList = new ArrayList<>();
            endList.addAll(quickSort(less));
            endList.addAll(pilotList);
            endList.addAll(quickSort(more));
            return endList;
        }
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        ArrayList<Integer> needSortList = new ArrayList<>();
        needSortList.add(10);
        needSortList.add(5);
        needSortList.add(20);
        needSortList.add(0);
        needSortList.add(16);
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList = quickSort.quickSort(needSortList);
        System.out.println(sortedList.toString());
    }

}
