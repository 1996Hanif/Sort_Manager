package org.example.sortFactory;

import org.example.sortAlgorithms.*;
import org.example.sortAlgorithms.binaryTree.BinaryTree;

import java.util.ArrayList;

public class SortFactory {

    private int method;
    private int amount;
    private ArrayList<Integer> randomList;
    private String methodName;
    private long timeTaken;

    public SortFactory(int method, int amount) {
        this.method = method;
        this.amount = amount;
        this.randomList = generateRandomList(amount);
    }
    public ArrayList<Integer> getSortedList(){
        Sorter sorterPicked = getSorter(method);
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(randomList);

        long startTime = System.nanoTime();
        sortedList = sorterPicked.sorter(sortedList);
        long endTime = System.nanoTime();
        timeTaken = endTime - startTime;

        return sortedList;
    }
    private ArrayList<Integer> generateRandomList(int amountOfValues){
        return RandomNumbersGenerator.RandomNumbersGenerator(amountOfValues);
    }
    private Sorter getSorter(int selectedSorterByUser){
        if (selectedSorterByUser == 1) {
            methodName = "Binary Tree";
            return new BinaryTree();
        }
        else if (selectedSorterByUser == 2) {
            methodName = "Bubble Sort";
            return new BubbleSort();
        }
        else if (selectedSorterByUser == 3) {
            methodName = "Insertion Sort";
            return new InsertionSort();
        }
        else if (selectedSorterByUser == 4) {
            methodName = "Merge Sort";
            return new MergeSort();
        }
        else if (selectedSorterByUser == 5) {
            methodName = "Quick Sort";
            return new QuickSort();
        }
        else if (selectedSorterByUser == 6){
            methodName = "Selection Sort";
            return new SelectionSort();
        }
        else
            return null;
    }
    public String getMethodName() {
        return methodName;
    }
    public long getTimeTaken() {
        return timeTaken;
    }
    public ArrayList<Integer> getRandomList() {
        return randomList;
    }



}
