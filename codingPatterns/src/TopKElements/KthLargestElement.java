package TopKElements;

import java.util.PriorityQueue;

/**
 * Find kth largest element
 * 3, 2, 1, 5, 6, 4
 */
public class KthLargestElement {

    public int findKthLargest(int[] arr, int n) {
        // priority queue follows FIFO
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int a : arr) {
            priorityQueue.add(a);
            if (priorityQueue.size() > n) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }
}
