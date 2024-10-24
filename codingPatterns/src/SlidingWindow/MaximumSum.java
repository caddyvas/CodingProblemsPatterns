package SlidingWindow;

public class MaximumSum {

    public int findMaximumSumSubArray(int subArraySize, int[] arr) {
        // 1, 1, 5, 0, 1, 2, 7, 0, 2, 1
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < subArraySize; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;
        for (int i = subArraySize; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - subArraySize];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
