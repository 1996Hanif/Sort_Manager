package org.example.sortAlgorithms;
import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements Sorter {
    @Override
    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {
        for (int j = 0; j < listOfRandomNumbers.size() - 1; j++) {
            //loops until biggest number is add the end of the list
            for (int i = 0; i < listOfRandomNumbers.size() - 1; i++) {
                //if number is bigger then the next number they will swap in the list
                if (listOfRandomNumbers.get(i) > listOfRandomNumbers.get(i + 1))
                    Collections.swap(listOfRandomNumbers, i ,i+1);
            }
        }
        return listOfRandomNumbers;
    }
}
