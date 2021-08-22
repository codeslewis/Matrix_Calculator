package io.lewiscodes.matrices;

import org.junit.jupiter.api.Test;
import io.lewiscodes.matrices.Calculators.*;
import io.lewiscodes.matrices.Exceptions.InvalidInputException;
import io.lewiscodes.matrices.Matrix;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
  @Test
  public void throwsExceptionForDifferentSizedMatrices() {
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
  public void simpleAdd() {
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
}