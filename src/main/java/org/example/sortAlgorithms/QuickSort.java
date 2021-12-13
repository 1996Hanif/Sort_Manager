package org.example.sortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuickSort implements Sorter {


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(132);
        array.add(34);
        array.add(1312);
        array.add(32);
        array.add(1);
        array.add(3);

        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.sorter(array));
    }
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {


        return quickSorter(listOfRandomNumbers, 0, listOfRandomNumbers.size());
    }
    private ArrayList quickSorter (ArrayList<Integer> list, int low, int high){
        list = listArrangerToSelectPivot(list);
        int pivot = list.size()/2;


        int leftValue = 0;
        int rightValue = 0;
        while (leftValue != -1 && rightValue != -1){
            leftValue = -1;
            rightValue = -1;

            for (int i = low; i < pivot; i++) {
                if( list.get(i) > list.get(pivot)) {
                    leftValue = i;
                    break;
                }
            }
            for (int i = high - 1; i > pivot; i--) {
                if( list.get(i) < list.get(pivot)) {
                    rightValue = i;
                    break;
                }
            }
            if (leftValue != -1 && rightValue != -1)
                Collections.swap(list, leftValue, rightValue);
            if (leftValue != -1)
                Collections.swap(list, leftValue, pivot);
            if (leftValue != -1 && rightValue != 0)
                Collections.swap(list, pivot, rightValue);
        }
        quickSorter(list, low, pivot);
        quickSorter(list, pivot, high);

        return list;

    }


    private ArrayList<Integer> listArrangerToSelectPivot(ArrayList<Integer> selectedList){
        int[] median = new int[3];
        median[0] = selectedList.get(0);
        median[1] = selectedList.get(selectedList.size()/2);
        median[2] = selectedList.get(selectedList.size()-1);
        Arrays.sort(median);
        selectedList.set(0, median[0]);
        selectedList.set(0, selectedList.size()/2);
        selectedList.set(0, selectedList.size());

        return selectedList;
    }
}
