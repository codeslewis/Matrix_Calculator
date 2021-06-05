package io.lewiscodes.matrices.Calculators;

import io.lewiscodes.matrices.Exceptions.InvalidInputException;
import io.lewiscodes.matrices.Matrix;

public class Add implements Calculation {
    private Matrix first;
    private Matrix second;

    public Add(Matrix first, Matrix second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Matrix calculate() throws InvalidInputException {
        if (!validateOperation()) throw new InvalidInputException("\tERROR!\n\tMatrices must have the same dimensions to add");
        Matrix outputMatrix = new Matrix(first.getRows(), first.getCols());
        double res;
        for (int i = 0; i < first.getRows(); i++) {
            for (int j = 0; j < first.getCols(); j++) {
                res = first.getEntry(i, j) + second.getEntry(i, j);
                outputMatrix.setEntry(i, j, res);
            }
        }
        return outputMatrix;
    }

    private boolean validateOperation() {
        return first.getRows() == second.getRows() && first.getCols() == second.getCols();
    }
}
