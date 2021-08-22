package io.lewiscodes.matrices.Calculators;

import io.lewiscodes.matrices.Matrix;

public class Transpose implements Calculation {
  private Matrix matrix;
  
  public Transpose(Matrix matrix) {
    this.matrix = matrix;
  }
  
  @Override
  public Matrix calculate() {
    double[][] outputMatrix = new double[matrix.getRows()][matrix.getCols()];
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                outputMatrix[i][j] = matrix.getEntry(j, i);
            }
        }
      return new Matrix(outputMatrix);
  }
}