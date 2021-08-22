package io.lewiscodes.matrices;

import org.junit.jupiter.api.Test;
import io.lewiscodes.matrices.Calculators.*;
import io.lewiscodes.matrices.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyTest {
  @Test
  public void throwsExceptionForSameShapeMatricesTest() {
    Matrix first = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Matrix second = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Calculation mult = new MultiplyMatrices(first, second);
    assertThrows(
      IllegalArgumentException.class, 
      mult::calculate,
      "Expected IllegalArgumentException to be thrown when matrices of same shape passed"
    );
  }
  
}