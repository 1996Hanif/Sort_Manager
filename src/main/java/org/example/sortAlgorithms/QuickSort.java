package org.example.sortAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class QuickSort implements Sorter {

    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {
        return quickSort(listOfRandomNumbers, 0, listOfRandomNumbers.size());
    }
    //recursive method used to divide list repeatedly in half
    private ArrayList quickSort (ArrayList<Integer> list, int low, int high){
        if (low < high){
            int pivotLocation = partOfList(list, low, high);
            quickSort(list, low, pivotLocation);
            quickSort(list,pivotLocation+1,high);
        }
        return list;
    }
    //sort part of list by swapping numbers around
    private int partOfList(ArrayList<Integer> list, int low, int high){
        int pivot = low;

        //goes through list checking if number are greater than pivot, places number below pivot
        for (int i = low + 1; i < high; i++) {
            if(list.get(i) < list.get(pivot)){
                Collections.swap(list, i, low);
            }
        }
        return (pivot);
    }

}
