package org.example.sortAlgorithms;

import java.util.Arrays;

public class BubbleSort implements SortTemplate {
    @Override
    public int[] sorter(int[] listOfRandomNumbers) {

        int temporaryHolder;

        for (int j = 0; j < listOfRandomNumbers.length - 1; j++) {
            for (int i = 0; i < listOfRandomNumbers.length - 1; i++) {
                if (listOfRandomNumbers[i] > listOfRandomNumbers[i + 1]) {
                    temporaryHolder = listOfRandomNumbers[i];
                    listOfRandomNumbers[i] = listOfRandomNumbers[i + 1];
                    listOfRandomNumbers[i + 1] = temporaryHolder;
                }
            }
        }

        return listOfRandomNumbers;
    }

    public static void main(String[] args) {
        int[] array = {3,4,52,5,235,6,36,36};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sorter(array)));
    }
}
