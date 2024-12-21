package matrixProblems;

public class MatrixMain {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        System.out.println("Is Target Found: " +search2DMatrix.searchMatrix(matrix, 60));

    }
}
