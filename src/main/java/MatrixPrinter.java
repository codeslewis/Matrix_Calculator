import java.util.stream.IntStream;

public class MatrixPrinter {
    public static void printMatrix(double[][] matrix) {
        System.out.println("\tThe result is:");
        for (double[] doubles : matrix) {
            IntStream.range(0, matrix[0].length).forEach(i -> System.out.printf("%4.0f", doubles[i]));
            System.out.println();
        }
    }
}
