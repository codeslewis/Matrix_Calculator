package io.lewiscodes.matrices;

import org.junit.jupiter.api.Test;
import io.lewiscodes.matrices.Calculators.*;
import io.lewiscodes.matrices.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
  @Test
  public void throwsExceptionForDifferentSizedMatricesTest() {
    Matrix first = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Matrix second = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Calculation adder = new Add(first, second);
    assertThrows(
      IllegalArgumentException.class, 
      adder::calculate,
      "Expected IllegalArgumentException to be thrown when different sized Matrices passed"
    );
  }
  
  @Test
  public void simpleAddTest() {
    Matrix first = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Matrix second = new Matrix(new double[][] {
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0},
      {1.0, 1.0, 1.0}
    });
    Matrix expected = new Matrix(new double[][] {
      {2.0, 2.0, 2.0},
      {2.0, 2.0, 2.0},
      {2.0, 2.0, 2.0}
    });
    Calculation adder = new Add(first, second);
    Matrix result = adder.calculate();
    assertEquals(
      expected, 
      result,
      "Simple Add test failed"
    );
  }
  
  @Test
  public void addRectangularMatrixTest() {
    Matrix first = new Matrix(new double[][] {
      {1.0, 2.5, 5.1},
      {1.3, 1.0, 1.0}
    });
    Matrix second = new Matrix(new double[][] {
      {1.0, 1.0, 4.9},
      {1.7, 1.0, 1.0}
    });
    Matrix expected = new Matrix(new double[][] {
      {2.0, 3.5, 10.0},
      {3.0, 2.0, 2.0}
    });
    Calculation adder = new Add(first, second);
    Matrix result = adder.calculate();
    assertEquals(
      expected, 
      result,
      "Simple Add test failed"
    );
  }
}