package io.lewiscodes.matrices;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Matrix {
    private int rows;
    private int cols;
    private double[][] matrix;

    private static int readRows(Scanner reader) {
        System.out.print("\tEnter the number of rows in the matrix\n");
        System.out.print("--> ");
        return reader.nextInt();
    }
    private static int readColumns(Scanner reader) {
        System.out.print("\tEnter the number of columns in the matrix\n");
        System.out.print("--> ");
        return reader.nextInt();
    }

    public static Matrix newMatrixFromInput(Scanner scanner) {
        int rows = readRows(scanner);
        int cols = readColumns(scanner);
        Matrix output = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((i + 1) + ", " + (j + 1) + " --> ");
                output.setEntry(i, j, scanner.nextDouble());
            }
        }
        return output;
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setEntry(int row, int col, double entry) {
        this.matrix[row][col] = entry;
    }

    public double getEntry(int row, int col) {
        return this.matrix[row][col];
    }

    public void printFormattedMatrix() {
        System.out.println("\tThe result is:");
        for (double[] doubles : matrix) {
            IntStream.range(0, matrix[0].length).forEach(i -> System.out.printf("%4.0f", doubles[i]));
            System.out.println();
        }
    }
}
