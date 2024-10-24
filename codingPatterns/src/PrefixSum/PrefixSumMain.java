package PrefixSum;

/**
 * Prefix Sum involves preprocessing an array to create a new array where each element at index i represents the sum of
 * the array from the start up to i. This allows for efficient sum queries on subarrays.
 * Ex: 1,2,3,4,5  --> 1,3,6,10,15  (Preprocess the the array to create a prefix sum array
 */
public class PrefixSumMain {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        SumOfSpecificRange sumOfSpecificRange = new SumOfSpecificRange();
        System.out.println("SumOfSpecificRange: " +sumOfSpecificRange.findSumOfElementsInSpecificRange(array, 1, 3));
    }
}
