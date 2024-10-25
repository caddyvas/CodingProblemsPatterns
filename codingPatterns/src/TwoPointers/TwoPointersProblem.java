package TwoPointers;

/**
 * The idea of this technique is to begin with two corners of the given array. We use two index variables left and right to traverse from both corners.
 * <p>
 * Initialize: left = 0, right = n – 1
 * Run a loop while left < right, do the following inside the loop
 * <p>
 * Compute current sum, sum = arr[left] + arr[right]
 * If the sum equals the target, we’ve found the pair.
 * If the sum is less than the target, move the left pointer to the right to increase the sum.
 * If the sum is greater than the target, move the right pointer to the left to decrease the sum.
 */

// Find two numbers in a sorted array that add up to a target value
// O(n) with O(1) space complexity

public class TwoPointersProblem {

    public static void sumOfValues(int[] arr, int target) {
        //[1, 2, 3, 4, 6], target = 6
        int left = 0;
        int right = arr.length - 1;
        int sum = arr[left] + arr[right];
        while (left < right) {
            if (sum == target) {
                break;
            }
            if (sum < target) {
                sum = arr[++left] + arr[right];
            } else {
                sum = arr[left] + arr[--right];
            }
        }
        System.out.println("Sum of two indexes that add to Target Value: [" + left + ", " + right + "]");
    }
}
