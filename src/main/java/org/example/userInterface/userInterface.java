package org.example.userInterface;

import org.example.sortAlgorithms.Sorter;
import org.example.sortFactory.SortFactory;

import java.util.Scanner;

public class userInterface {
    public static void main(String[] args) {
        printWelcomeInterface();


    }
    public static void printWelcomeInterface(){
        System.out.println("--------------------------------------------------------");
        System.out.println("                  SORT MANAGER");
        System.out.println("--------------------------------------------------------");
        System.out.println("Pick the sorting type:");
        System.out.println("1. Binary Tree");
        System.out.println("2. Binary Tree");
        System.out.println("3. Binary Tree");
        System.out.println("4. Binary Tree");
        System.out.println("5. Binary Tree");
        System.out.println("6. Binary Tree");

        Scanner scanner = new Scanner(System.in);
        int numberChosen = scanner.nextInt();

        System.out.println("Pick the amount of Number:");
        int amountChosen = scanner.nextInt();

        Sorter sort = SortFactory.getSorter(numberChosen);
        System.out.println(sort.sorter(SortFactory.getRandomList(amountChosen)));

        System.out.println("Repeat?(Y/N)");
        int repeat = scanner.nextInt();
        System.out.println(repeat);

        if (repeat == 1)
         printWelcomeInterface();
    }

}
