package org.example.userInterface;

import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

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
    public int inputAmountOfNumbers(){
        //check if integer is input
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.err.print("ERROR NOT AN INTEGER:     ");
        }
        int numberChosen = scanner.nextInt();
        return numberChosen;
    }
    public String inputRepeat(){
        String methodChosen = scanner.next();
        if (!methodChosen.equals("Y"))
            System.out.println("Goodbye");

        return methodChosen;
    }
    public void closeScanner(){
        scanner.close();
    }


}
