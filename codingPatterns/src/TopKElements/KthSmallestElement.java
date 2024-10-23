package TopKElements;

import java.util.PriorityQueue;

public class KthSmallestElement {

    public int findKthSmallest(int[] arr, int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int a : arr) {
            queue.add(a);
        }

        int count = 0;
        int result = 0;
        while (count != n && !queue.isEmpty()) {
            count++;
            result = queue.poll();
        }
        return result;
    }
}
