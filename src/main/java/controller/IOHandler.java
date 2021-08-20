package controller;

import model.Sudoku;

import java.util.Scanner;

public class IOHandler {
    Scanner scanner = new Scanner(System.in);

    public void getInput(){
        System.out.println("Welcome to model.Sudoku Solver 1.0! If you enjoy this please send nudes to the creator!");
        System.out.println("Please enter the unsolved sudoku in the following format:");
        System.out.println("In each row enter 9 digits: 1-9 for the filled squares and 0 for empty squares.");
        Character[][] input = new Character[9][9];
        for (int i = 0; i < 9 ; i++) {
            char[] arrayList = scanner.nextLine().toCharArray();
            for (int j = 0; j < 9; j++) {
                input[i][j] = arrayList[j];
            }
        }
        printOutput(new Sudoku(input).toString());
    }

    public void printOutput(String output){
        System.out.println(output);
        System.out.println("Press Enter to exit!");
        scanner.nextLine();
    }
}
