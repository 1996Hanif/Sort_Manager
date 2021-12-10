package org.example.sortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort implements SortTemplate {
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {

        int temporaryHolder;

        for (int j = 0; j < listOfRandomNumbers.size() - 1; j++) {
            for (int i = 0; i < listOfRandomNumbers.size() - 1; i++) {
                if (listOfRandomNumbers.get(i) > listOfRandomNumbers.get(i + 1)) {
                    temporaryHolder = listOfRandomNumbers.get(i);
                    listOfRandomNumbers.set(i, listOfRandomNumbers.get(i + 1));
                    listOfRandomNumbers.set(i + 1, temporaryHolder);
                }
            }
        }

        return listOfRandomNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(132);
        array.add(34);
        array.add(1312);
        array.add(32);
        array.add(1);

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(bubbleSort.sorter(array));
    }
}
