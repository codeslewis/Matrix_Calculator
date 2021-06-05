package io.lewiscodes.matrices.Calculators;

import io.lewiscodes.matrices.Matrix;

public class ScalarMult implements Calculation {
    private Matrix matrix;
    private double scalar;

    public ScalarMult(Matrix matrix, double scalar) {
        this.matrix = matrix;
        this.scalar = scalar;
    }

    @Override
    public Matrix calculate() {
        Matrix outputMatrix = new Matrix(matrix.getRows(), matrix.getCols());
        double res;
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                res = matrix.getEntry(i, j) * scalar;
                outputMatrix.setEntry(i, j, res);
            }
        }
        return outputMatrix;
    }
}
