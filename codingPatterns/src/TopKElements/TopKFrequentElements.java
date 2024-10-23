package TopKElements;

import java.util.*;

public class TopKFrequentElements {

    public void findKthFrequentElements(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<Integer>[] bucket = new List[arr.length];
        int count = 0;
        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i > 0; i--) {
            if(count == n) {
                break;
            }
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
                count++;
            }
        }
        System.out.println(result);
    }
}
