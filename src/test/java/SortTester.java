import org.example.sortAlgorithms.*;
import org.example.sortAlgorithms.binaryTree.BinaryTree;
import org.example.sortFactory.RandomNumbersGenerator;
import org.example.sortFactory.SortFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortTester {

    //Each test method tests the same 4 randomly generated arrays with lengths 1,10,100,1000
    //against the Collections.sort method to see if each sorting method sorts correctly.
    @Nested
    class testAllSortingMethodAgainstCollectionsSort {
        private ArrayList<ArrayList> randomLists = new ArrayList<>();
        private ArrayList<ArrayList> provenSortList = new ArrayList<>();
        @BeforeEach
        void setupForSorter() {
            //Produces 4 reusable random list of numbers,
            //along with a sorted version of each list to be tested against the sorters
            for (int i = 0; i < 4; i++) {
                randomLists.add(RandomNumbersGenerator.RandomNumbersGenerator((int) Math.pow(10, i)));
                provenSortList.add(randomLists.get(i));
                Collections.sort(provenSortList.get(i));
            }
        }
        @Test
        void testBinaryTree() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter binaryTree = new BinaryTree();
                assertEquals(provenSortList.get(i), binaryTree.sorter(randomLists.get(i)));
            }
        }
        @Test
        void testBubbleSort() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter bubbleSort = new BubbleSort();
                assertEquals(provenSortList.get(i), bubbleSort.sorter(randomLists.get(i)));
            }
        }
        @Test
        void testInsertionSort() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter insertionSort = new InsertionSort();
                assertEquals(provenSortList.get(i), insertionSort.sorter(randomLists.get(i)));
            }
        }
        @Test
        void testMergeSort() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter mergeSort = new MergeSort();
                assertEquals(provenSortList.get(i), mergeSort.sorter(randomLists.get(i)));
            }
        }
        @Test
        void testQuickSort() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter quickSort = new QuickSort();
                assertEquals(provenSortList.get(i), quickSort.sorter(randomLists.get(i)));
            }
        }
        @Test
        void testSelectionSort() {
            for (int i = 0; i < provenSortList.size(); i++) {
                Sorter selectionSort = new SelectionSort();
                assertEquals(provenSortList.get(i), selectionSort.sorter(randomLists.get(i)));
            }
        }

    }
    //Testing correct info is given back by the SortFactory when inputting Data within it
    @Nested
    class FactoryTest {
        private SortFactory sortFactory;

        @ParameterizedTest
        @ValueSource(ints = {1, 2, 3, 4, 5, 6})
        void testCorrectSorterNameReturns(int number) {
            String[] sortNames = {"Binary Tree", "Bubble Sort", "Insertion Sort", "Merge Sort", "Quick Sort", "Selection Sort"};
            sortFactory = new SortFactory(number,10);
            assertEquals(sortNames[number - 1], sortFactory.getMethodName());
        }
        @ParameterizedTest
        @ValueSource(ints = {1, 10, 5, 100, 45, 2})
        void testCorrectAmountOfRandomNumbersReturn(int number) {
            sortFactory = new SortFactory(1, number);
            assertEquals(number, sortFactory.getRandomList().size());
        }

    }
    //given the user inputs the sorting type and the amount of numbers of the list
    //these tests will see if the correct info is given back to the user
    @Nested
    class SingleUseCase{
        SortFactory sortFactory;
        @BeforeEach
        void setupForExample() {
            sortFactory = new SortFactory(1, 10);
            sortFactory.getSortedList();
        }
        @Test
        void testMethodNameReturns(){assertEquals("Binary Tree", sortFactory.getMethodName());}
        @Test
        void testRandomListReturns(){assertEquals(10, sortFactory.getRandomList().size());}
        @Test
        void testSortedListReturns(){assertEquals(10, sortFactory.getSortedList().size());}
        @Test
        void testTimeTakenReturns(){assertTrue(0 < sortFactory.getTimeTaken());}

    }

}
