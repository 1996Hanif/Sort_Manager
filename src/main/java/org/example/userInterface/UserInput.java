package org.example.userInterface;

import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }
    //validates the sort to be used, allowing user to only input number 1 to 6
    public int inputMethod(){
        boolean validInput = false;
        int methodChosen = -1;
        while(validInput == false) {
            //check if integer is input
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.err.print("ERROR NOT AN INTEGER:     ");
            }
            methodChosen = scanner.nextInt();
            //check if number between 1 and 6
            if (methodChosen < 1 || methodChosen > 6) {
                System.err.print("ERROR INPUT ONLY 1 - 6:   ");
                validInput = false;
            }
            else
                validInput = true;
        }
        return methodChosen;

    }
    //validates the amount of numbers the user wants, so that the user only inputs positive numbers
    public int inputAmountOfNumbers(){
        boolean validInput = false;
        int numberChosen = -1;
        while(validInput == false) {
            //check if integer is input
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.err.print("ERROR NOT AN INTEGER:     ");
            }
            numberChosen = scanner.nextInt();

            if (numberChosen == 0) {
                System.err.print("ERROR CANNOT INPUT 0:   ");
                validInput = false;
            } else
                validInput = true;
        }
        return numberChosen;
    }
    //checks if user inputs Y to restart the program
    public String inputRepeat(){
        String methodChosen = scanner.next();
        if (!methodChosen.equals("Y"))
            System.out.println("THANKS FOR USING SORT MANAGER");

        return methodChosen;
    }
    public void closeScanner(){
        scanner.close();
    }


}
