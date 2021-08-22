package io.lewiscodes.matrices.Calculators;

import io.lewiscodes.matrices.Matrix;

public class MultiplyMatrices implements Calculation {
    private Matrix first;
    private Matrix second;

    public MultiplyMatrices(Matrix first, Matrix second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public Matrix calculate() {
        if (!validateOperation()) {
            throw new IllegalArgumentException("\tERROR\n\tMatrices cannot be multiplied\n\tThe number of rows of a matrix must match the number of columns of another matrix in order to multiply them\n");
        }
        double[][] outputMatrix = new double[first.getRows()][second.getCols()];
        for (int i = 0; i < first.getRows(); i++) {
            for (int j = 0; j < second.getCols(); j++) {
                for (int k = 0; k < first.getCols(); k++) {
                    outputMatrix[i][j] += first.getEntry(i, k) * second.getEntry(k, j);
                }
            }
        }
        return new Matrix(outputMatrix);
    }

    private boolean validateOperation() {
        return first.getRows() == second.getCols() && first.getCols() == second.getRows();
    }
}
