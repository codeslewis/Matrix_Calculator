package io.lewiscodes.matrices;

import org.junit.jupiter.api.Test;
import io.lewiscodes.matrices.Calculators.*;
import io.lewiscodes.matrices.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class ScalarMultTest {
  @Test
  public void simpleScalarMultTest() {
    Matrix multiplicand = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    double scalar = 2.0;
    Matrix expected = new Matrix(new double[][] {
      {2.0, 2.0, 2.0},
      {2.0, 2.0, 2.0},
      {2.0, 2.0, 2.0}
    });
    Calculation scalarMult = new ScalarMult(multiplicand, scalar);
    Matrix result = scalarMult.calculate();
    assertEquals(
      expected, 
      result,
      "Simple Scalar multiplication test failed"
    );
  }
}