package org.example.sortFactory;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersGenerator {
    public static ArrayList<Integer> RandomNumbersGenerator(int amountOfValues){
        ArrayList<Integer> listOfRandomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfValues; i++) {
            int randomNumber = random.nextInt(Integer.MAX_VALUE);
            listOfRandomNumbers.add(randomNumber);
        }
        return listOfRandomNumbers;
    }
}
