package org.example.sortAlgorithms;

import java.util.ArrayList;

public class MergeSort implements Sorter {
    private int amountOfValues;

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(132);
        array.add(34);
        array.add(1312);
        array.add(32);
        array.add(1);
        array.add(3);

        MergeSort mergeSort = new MergeSort();
        System.out.println(mergeSort.sorter(array));
    }
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> givenList) {
        if (givenList.size() == 1)
            return givenList;

        ArrayList<Integer>listHalf1 = new ArrayList<>();
        ArrayList<Integer>listHalf2 = new ArrayList<>();

        for (int index = 0; index < givenList.size(); index++) {
            if(index < givenList.size()/2)
                listHalf1.add(givenList.get(index));
            else
                listHalf2.add(givenList.get(index));
        }

        listHalf1 = sorter(listHalf1);
        listHalf2 = sorter(listHalf2);

        return listsMerge(listHalf1, listHalf2);
    }

    private ArrayList listsMerge(ArrayList<Integer> half1, ArrayList<Integer> half2){
        ArrayList<Integer> mergedLists = new ArrayList<>();

        while(!half1.isEmpty() && !half2.isEmpty())
        {
            if (half1.get(0) < half2.get(0)){
                mergedLists.add(half1.get(0));
                half1.remove(0);
            }
            else {
                mergedLists.add(half2.get(0));
                half2.remove(0);
            }
        }
        //Used if one of the arrays still have values within
        while(!half1.isEmpty()){
            mergedLists.add(half1.get(0));
            half1.remove(0);
        }
        while(!half2.isEmpty()){
            mergedLists.add(half2.get(0));
            half2.remove(0);
        }
        return mergedLists;
    }
}
