import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Menu menu = new Menu();

        boolean exit = false;
        while (!exit) {
            int menuChoice = menu.mainMenuSelection(reader);
            Calculation calculator;
            Operation operation;

            switch (menuChoice) {
                case 0:
                    exit = true;
                    System.out.println("Exiting!");
                    break;
                case 1:
                    Calculations.biCalculation(Operation.ADD, reader);
                    break;
                case 2:
                    operation = Operation.SCALAR;
                    System.out.println(operation.getExplanation());
                    Matrix matrix = Matrix.newMatrixFromInput(reader);
                    System.out.println("\tEnter a scalar to multiply by:");
                    System.out.print("--> ");
                    double scalar = reader.nextDouble();
                    calculator = new ScalarMult(matrix, scalar);
                    calculator.calculate().printFormattedMatrix();
                    break;
                case 3:
                    Calculations.biCalculation(Operation.MULTIPLY, reader);
                    break;
                case 4:
                    int transpositionChoice = menu.transposeMenuSelection(reader);
                    switch (transpositionChoice) {
                        case 1:
                            System.out.println("Performing Main Diagonal Transposition");
                            Inputs.mainTransposition(reader);
                            break;
                        case 2:
                            System.out.println("Performing Side Transposition");
                            Inputs.sideTransposition(reader);
                            break;
                        case 3:
                            System.out.println("Performing Vertical Transposition");
                            Inputs.verticalTransposition(reader);
                            break;
                        case 4:
                            System.out.println("Performing Horizontal Transposition");
                            Inputs.horizontalTransposition(reader);
                            break;
                        default:
                            System.out.println("Unrecognised input... restarting program");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Calculating the Determinant of a Matrix");
                    Inputs.determinantOfMatrix(reader);
                    break;
                case 6:
                    System.out.println("Calculating the Inverse of a Matrix");
                    Inputs.inverseOfMatrix(reader);
                    break;
                default:
                    System.out.println("Unrecognised input, please try again");
            }
        }
    }
}
