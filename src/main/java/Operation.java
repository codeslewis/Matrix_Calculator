public enum Operation {
    ADD("Performing Matrix Addition"),
    SCALAR("Performing Scalar Multiplication"),
    MULTIPLY("Performing Matrix Multiplication"),
    TRANSPOSE("Performing Main Diagonal Transposition"),
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
