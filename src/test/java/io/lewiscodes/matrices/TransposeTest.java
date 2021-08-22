package io.lewiscodes.matrices;

import org.junit.jupiter.api.Test;
import io.lewiscodes.matrices.Calculators.*;
import io.lewiscodes.matrices.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class TransposeTest {
  @Test
  public void simpleTransposeTest() {
    Matrix input = new Matrix(new double[][] {
      {1.0, 2.0},
      {3.0, 4.0}
    });
    Matrix expected = new Matrix(new double[][] {
      {1.0, 3.0},
      {2.0, 4.0}
    });
    Calculation transpose = new Transpose(input);
    Matrix result = transpose.calculate();
    assertEquals(
      expected, 
      result,
      "Simple transpose test failed"
    );
  }

}