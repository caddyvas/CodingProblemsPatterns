package matrixProblems;

/**
 * You are given an m x n integer matrix matrix with the following two properties:
 * <p>
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 */
public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int potentialRow = searchPotentialRow(matrix, target);
        System.out.println("PotentialRow: " + potentialRow);
        if (potentialRow != -1) {
            return isTargetFound(matrix, potentialRow, target);
        }
        return false;
    }

    // perform binary search to find a potential row
    private int searchPotentialRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target) {
                return mid;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    private boolean isTargetFound(int[][] matrix, int potentialRow, int target) {
        int low = 0;
        int high = matrix[potentialRow].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[potentialRow][mid] == target) {
                System.out.println("Target found in Index: " + potentialRow + ", " + mid);
                return true;
            }
            if (matrix[potentialRow][mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
