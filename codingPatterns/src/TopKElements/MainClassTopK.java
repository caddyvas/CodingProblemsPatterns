package TopKElements;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ThreadPoolExecutor;

public class MainClassTopK {

    //{3,2,1,5,2,4,7,3}
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        KthLargestElement largestElement = new KthLargestElement();
        System.out.println("Kth Largest Element: " + largestElement.findKthLargest(arr, 1));

        KthSmallestElement smallestElement = new KthSmallestElement();
        System.out.println("Kth Smallest Element: " + smallestElement.findKthSmallest(arr, 3));
        int[] arr1 = {1, 1, 1, 1, 2, 3, 2, 5, 5, 6};
        TopKFrequentElements frequentElements = new TopKFrequentElements();
        frequentElements.findKthFrequentElements(arr1, 2);

        // This is just for quick reference
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("STACK PEEK - LIFO: " + stack.peek());
        System.out.println("QUEUE PEEK - FIFO: " + queue.peek());
    }
}
