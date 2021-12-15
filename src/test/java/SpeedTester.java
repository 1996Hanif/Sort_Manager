import org.example.sortFactory.RandomNumbersGenerator;
import org.example.sortFactory.SortFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SpeedTester {
    private int amountOfTestsToAverageOut;
    private int sizeOfList;
    private boolean showDetail;
    @BeforeEach
    void setup(){
        amountOfTestsToAverageOut = 3;
        sizeOfList = 120;
        showDetail = true;
    }
    @Test
    void testBinaryTreeTime(){
        System.out.println("BINARY TREE");
        averageTimeTaken(1);
    }
    @Test
    void testBubbleSortTime(){
        System.out.println("BUBBLE SORT");
        averageTimeTaken(2);
    }
    @Test
    void testInsertionTime(){
        System.out.println("INSERTION SORT");
        averageTimeTaken(3);
    }
    @Test
    void testMergeSortTime(){
        System.out.println("MERGE SORT");
        averageTimeTaken(4);
    }
    @Test
    @Disabled
    void testQuickSortTime(){
        System.out.println("QUICK SORT");
        averageTimeTaken(5);
    }
    @Test
    void testSelectionSortTime(){
        System.out.println("SELECTION SORT");
        averageTimeTaken(6);
    }

    public void averageTimeTaken(int sortMethod){
        double timeTaken = 0;
        for (int i = 1; i < amountOfTestsToAverageOut + 1; i++) {
            SortFactory sortFactory = new SortFactory(sortMethod, sizeOfList);
            sortFactory.getSortedList();
            if (showDetail == true) {
                System.out.print("TEST: " + i+ "   ");
                System.out.println("Sorted List: " + sortFactory.getSortedList());
                System.out.println("          Time Taken:  " + sortFactory.getTimeTaken() + " nanoseconds");
            }
            timeTaken = timeTaken + sortFactory.getTimeTaken();
        }
        System.out.println("----------------------------------------------------------");
        System.out.print("NUMBER OF TESTS: " + amountOfTestsToAverageOut + "  |  ");
        System.out.println("AVERAGE TIME TAKEN: " + timeTaken/amountOfTestsToAverageOut + " nanoseconds");
        System.out.println("----------------------------------------------------------");
    }
}
