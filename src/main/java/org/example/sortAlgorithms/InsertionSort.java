package org.example.sortAlgorithms;

import java.util.ArrayList;

public class InsertionSort implements Sorter {

    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {
        //looks through each number in the list
        for (int i = 1; i < listOfRandomNumbers.size(); i++) {
            int valuesBefore = i ;
            //if the number is less than the number before it in the list it will loop again
            while (listOfRandomNumbers.get(i) <= listOfRandomNumbers.get(valuesBefore) ){
                //if there is no value less than value i, i will be placed at the start of the list
                if (valuesBefore  == 0) {
                    listOfRandomNumbers.add(valuesBefore, listOfRandomNumbers.remove(i));
                    break;
                }
                //if i is bigger then a value before valuesBefore, i will be placed between the two values
                else if (listOfRandomNumbers.get(i) > listOfRandomNumbers.get(valuesBefore - 1)) {
                    listOfRandomNumbers.add(valuesBefore, listOfRandomNumbers.remove(i));
                    break;
                }
                //this is used to iterate through all the values before i in the list that are greater then i
                valuesBefore -= 1;
            }
        }
        return listOfRandomNumbers;
    }
}
