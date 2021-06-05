package io.lewiscodes.matrices;

import io.lewiscodes.matrices.Menu.Menu;
import io.lewiscodes.matrices.Menu.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            int menuChoice = menu.mainMenuSelection(reader);

            switch (menuChoice) {
                case 0 -> exitProgram();
                case 1 -> Calculations.biCalculation(Operation.ADD, reader);
                case 2 -> Calculations.unaryCalculation(Operation.SCALAR, reader);
                case 3 -> Calculations.biCalculation(Operation.MULTIPLY, reader);
                case 4 -> {
                    int transpositionChoice = menu.transposeMenuSelection(reader);
                    switch (transpositionChoice) {
                        case 1 -> {
                            System.out.println("Performing Diagonal Transposition");
                            Inputs.mainTransposition(reader);
                        }
                        case 2 -> {
                            System.out.println("Performing Side Transposition");
                            Inputs.sideTransposition(reader);
                        }
                        case 3 -> {
                            System.out.println("Performing Vertical Transposition");
                            Inputs.verticalTransposition(reader);
                        }
                        case 4 -> {
                            System.out.println("Performing Horizontal Transposition");
                            Inputs.horizontalTransposition(reader);
                        }
                        default -> System.out.println("Unrecognised input... restarting program");
                    }
                }
                case 5 -> {
                    System.out.println("Calculating the Determinant of a Matrix");
                    Inputs.determinantOfMatrix(reader);
                }
                case 6 -> {
                    System.out.println("Calculating the Inverse of a Matrix");
                    Inputs.inverseOfMatrix(reader);
                }
                default -> System.out.println("Unrecognised input, please try again");
            }
        }
    }

    private static void exitProgram() {
        System.out.println("Exiting!");
        System.exit(1);
    }
}
