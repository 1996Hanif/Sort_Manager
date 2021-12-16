package org.example.userInterface;

import org.example.sortAlgorithms.Sorter;
import org.example.sortFactory.SortFactory;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class PrintInterface {
    //prints out welcome message to terminal
    public void printWelcomeInterface() {
        System.out.println("-----------------------------------------");
        System.out.println("             SORT MANAGER");
    }
    //prints out enter sorting type, with a selection to pick from
    public void printSortList(){
        System.out.println("-----------------------------------------");
        System.out.println("1. Binary Tree      2. Bubble Sort");
        System.out.println("3. Insertion Sort   4. Merge Sort");
        System.out.println("5. Quick Sort       6. Selection Tree");
        System.out.println("-----------------------------------------");
        System.out.print("PICK THE SORTING TYPE :        ");
    }
    public void printPickAmountOfNumbers(){
        System.out.print("PICK THE AMOUNT OF NUMBERS :   ");
    }

    //prints out the results of the given inputs from the user
    public void printResults(int method, int amount){
        SortFactory sortFactory = new SortFactory(method, amount);
        System.out.println("-----------------------------------------");
        System.out.println("METHOD NAME:    " + sortFactory.getMethodName());
        System.out.println("RANDOM LIST:    " + sortFactory.getRandomList());
        System.out.println("SORTED LIST:    " + sortFactory.getSortedList());
        System.out.println("TIME TAKEN:     " + sortFactory.getTimeTaken() + " nanoseconds");
        System.out.println("-----------------------------------------");
    }


    public void printRestartMessage(){
        System.out.print("RESTART? Y/N    ");
    }



}
