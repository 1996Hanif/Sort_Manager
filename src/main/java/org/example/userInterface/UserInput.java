package org.example.userInterface;

import java.util.Scanner;

public class UserInput {
    Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public int inputMethod(){
        int methodChosen = scanner.nextInt();
        while (methodChosen < 0 || methodChosen > 7) {
            System.err.print("ERROR ONLY 1 - 6:     ");
            methodChosen = scanner.nextInt();
        }
        return methodChosen;

    }
    public int inputAmountOfNumbers(){
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
