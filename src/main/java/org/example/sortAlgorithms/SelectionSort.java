package org.example.sortAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort implements SortTemplate{
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(132);
        array.add(34);
        array.add(1312);
        array.add(32);
        array.add(1);
        array.add(3);
        array.add(569);
        System.out.println(selectionSort.sorter(array));
    }
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {
        int smallestValue;
        int positionOfSmallestValue = 0;
        for (int i = 0; i < listOfRandomNumbers.size(); i++) {
            //resets values for next value in array
            smallestValue = listOfRandomNumbers.get(i);
            positionOfSmallestValue = i;
            //compares next value in array with all values after the values index
            for (int j = i; j < listOfRandomNumbers.size(); j++) {
                //if next values are smaller than current smallestValue then replace it
                if (smallestValue > listOfRandomNumbers.get(j)) {
                    smallestValue = listOfRandomNumbers.get(j);
                    positionOfSmallestValue = j;
                }
            }
            Collections.swap(listOfRandomNumbers, i, positionOfSmallestValue);
        }
        return listOfRandomNumbers;
    }
}
