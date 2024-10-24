package SlidingWindow;

/**
 * Problems which can be solved in O(N2) time complexity using nested loops can be solved in O(n) Time Complexity.
 * <p>
 * Required Time Complexity - O(N) or O(Nlog(N))
 */
public class SlidingWindowMain {

    public static void main(String[] args) {
        MaximumSum maximumSum = new MaximumSum();
        maximumSum.findMaximumSumSubArray(3, new int[]{1, 1, 5, 0, 1, 2, 7, 0, 2, 1});

        LongestSubString longestSubString = new LongestSubString();
        System.out.println("LongestSubString_Length: " + longestSubString.findLongestSubstring("abcbbcbbkhlkkmnhhgbabfds"));
    }
}
