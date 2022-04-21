package code021;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    private int findSmallest(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        int smallest_index = 0;

        int arr_length = arr.size();
        for(int i=1; i<arr_length; i++){
            if(arr.get(i) < smallest){
                smallest = arr.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    public int[] selectionSort(ArrayList<Integer> arr) {
        int arr_length = arr.size();
        int[] newArr = new int[arr_length];
        for(int j=0; j<arr_length; j++) {
            int smallest = findSmallest(arr);
            newArr[j] = arr.get(smallest);
            arr.remove(smallest);
        }
        return newArr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(10);
        int[] sortedArr = selectionSort.selectionSort(arrayList);
        System.out.println(Arrays.toString(sortedArr));
    }

}
