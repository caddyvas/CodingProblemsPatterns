package PrefixSum;

public class SumOfSpecificRange {

    // formula to calculate the sum from preprocessed array P: P[j] - P[i-1]
    public int findSumOfElementsInSpecificRange(int[] arr, int m, int n) {
        // 1,2,3,4,5,6
        int previousSum = 0;
        // O(n)
        for (int i = 0; i < arr.length; i++) {
            previousSum = previousSum + arr[i];
            arr[i] = previousSum;
        }

        //O(n)
        return arr[n] - arr[m - 1];
    }
}
