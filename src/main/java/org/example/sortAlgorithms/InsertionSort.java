package org.example.sortAlgorithms;

import java.util.ArrayList;

public class InsertionSort implements Sorter {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(132);
        array.add(34);
        array.add(1312);
        array.add(32);
        array.add(1);
        array.add(3);
        array.add(569);
        System.out.println(insertionSort.sorter(array));
    }
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {

        for (int i = 1; i < listOfRandomNumbers.size(); i++) {
            int valuesBefore = i ;
            while (listOfRandomNumbers.get(i) <= listOfRandomNumbers.get(valuesBefore) ){
                if (valuesBefore - 1 == -1) {
                    listOfRandomNumbers.add(valuesBefore, listOfRandomNumbers.remove(i));
                    break;
                }
                else if (listOfRandomNumbers.get(i) > listOfRandomNumbers.get(valuesBefore - 1)) {
                    listOfRandomNumbers.add(valuesBefore, listOfRandomNumbers.remove(i));
                    break;
                }
                valuesBefore -= 1;
            }
        }
        return listOfRandomNumbers;
    }
}
