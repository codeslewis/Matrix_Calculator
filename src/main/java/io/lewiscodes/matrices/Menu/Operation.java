package io.lewiscodes.matrices.Menu;

public enum Operation {
    ADD("Performing io.lewiscodes.matrices.Matrix Addition"),
    SCALAR("Performing Scalar Multiplication"),
    MULTIPLY("Performing io.lewiscodes.matrices.Matrix Multiplication"),
    TRANSPOSE("Performing io.lewiscodes.matrices.Main Diagonal Transposition"),
    DETERMINANT("Calculating the Determinant of a io.lewiscodes.matrices.Matrix"),
    INVERSE("Calculating the Inverse of a io.lewiscodes.matrices.Matrix");

    private String explanation;

    public String getExplanation() {
        return explanation;
    }

    Operation(String explanation) {
        this.explanation = explanation;
    }
}
