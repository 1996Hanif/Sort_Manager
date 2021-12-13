package org.example.sortFactory;

import org.example.sortAlgorithms.*;
import org.example.sortAlgorithms.binaryTree.BinaryTree;

import java.util.ArrayList;

public class SortFactory {
    public static void main(String[] args) {
        Sorter sort = SortFactory.getSorter(1);
        System.out.println(sort.sorter(SortFactory.getRandomList(20)));
    }
    private static ArrayList<Integer> getRandomList(int amountOfValues){
        return RandomNumbersGenerator.RandomNumbersGenerator(amountOfValues);
    }
    private static Sorter getSorter(int selectedSorterByUser){
        if (selectedSorterByUser == 1)
            return new BinaryTree();
        else if (selectedSorterByUser == 2)
            return new BubbleSort();
        else if (selectedSorterByUser == 3)
            return new InsertionSort();
        else if (selectedSorterByUser == 4)
            return new MergeSort();
        else if (selectedSorterByUser == 5)
            return new QuickSort();
        else if (selectedSorterByUser == 6)
            return new SelectionSort();
        else
            return null;
    }
}
