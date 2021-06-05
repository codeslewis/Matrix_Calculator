package io.lewiscodes.matrices.Menu;

public enum Operation {
    ADD("Performing Addition"),
    SCALAR("Performing Scalar Multiplication"),
    MULTIPLY("Performing Multiplication"),
    TRANSPOSE("Performing Diagonal Transposition"),
    DETERMINANT("Calculating the Determinant of a Matrix"),
    INVERSE("Calculating the Inverse of a Matrix");

    private String explanation;

    public String getExplanation() {
        return explanation;
    }

    Operation(String explanation) {
        this.explanation = explanation;
    }
}
