package org.example.sortFactory;

import org.example.sortAlgorithms.*;
import org.example.sortAlgorithms.binaryTree.BinaryTree;

import java.util.ArrayList;

public class SortFactory {

    private int method;
    private ArrayList<Integer> randomList;
    private String methodName;
    private long timeTaken;
    //sets the sorter to be used, and produces a random number list based on the method and amount given
    public SortFactory(int method, int amount) {
        this.method = method;
        this.randomList = RandomNumbersGenerator.RandomNumbersGenerator(amount);
    }
    //sorts the random list and returns it back
    public ArrayList<Integer> getSortedList(){
        Sorter sorterPicked = getSorter(method);
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(randomList);

        //used to time how long the sorter takes to sort the random list
        long startTime = System.nanoTime();
        sortedList = sorterPicked.sorter(sortedList);
        long endTime = System.nanoTime();
        timeTaken = endTime - startTime;

        return sortedList;
    }
    //number inputted initially by the user and returns the sorting method to be used
    private Sorter getSorter(int selectedSorterByUser){
        if (selectedSorterByUser == 1) return new BinaryTree();
        else if (selectedSorterByUser == 2) return new BubbleSort();
        else if (selectedSorterByUser == 3) return new InsertionSort();
        else if (selectedSorterByUser == 4) return new MergeSort();
        else if (selectedSorterByUser == 5) return new QuickSort();
        else if (selectedSorterByUser == 6) return new SelectionSort();
        else return null;
    }
    //number inputted initially by the user and returns the name of the sorter to be used
    public String getMethodName() {
        if (method == 1) methodName = "Binary Tree";
        if (method == 2) methodName = "Bubble Sort";
        if (method == 3) methodName = "Insertion Sort";
        if (method == 4) methodName = "Merge Sort";
        if (method == 5) methodName = "Quick Sort";
        if (method == 6) methodName = "Selection Sort";
        return methodName;
    }
    //returns time taken to sort the random list
    public long getTimeTaken() {
        return timeTaken;
    }
    //returns the initial random list
    public ArrayList<Integer> getRandomList() {
        return randomList;
    }



}
