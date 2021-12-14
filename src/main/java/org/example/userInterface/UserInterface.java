package org.example.userInterface;

import org.example.sortAlgorithms.Sorter;
import org.example.sortFactory.SortFactory;

import java.util.ArrayList;

public class UserInterface {
    public static void userInterface() {
        PrintInterface printInterface = new PrintInterface();
        UserInput userInput = new UserInput();

        printInterface.printWelcomeInterface();
        String repeat = "Y";
        while(repeat.equals("Y")) {
            printInterface.printSortList();
            int method = userInput.inputMethod();
            printInterface.printPickAmountOfNumbers();
            int amount = userInput.inputAmountOfNumbers();
            printInterface.printResults(method, amount);
            printInterface.printRestartMessage();
            repeat = userInput.inputRepeat();
        }
        userInput.closeScanner();
    }
}
