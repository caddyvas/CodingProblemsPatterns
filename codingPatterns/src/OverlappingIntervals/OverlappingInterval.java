package OverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingInterval {

    // Bruteforce approach with time O(n2) and space O(1)
    public List<int[]> mergeOverlapBruteForce(int[][] arr) {
        int len = arr.length;

        // sort the array first
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            // skip already merged intervals
            if (!list.isEmpty() && list.get(list.size() - 1)[1] >= end) {
                continue;
            }

            // find the end of the merged range
            for (int j = i + 1; j < len; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
            }
            list.add(new int[]{start, end});
        }
        return list;
    }

    public List<int[]> mergeIntervalExpectedApproach(int[][] arr) { // {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        // first sort the array
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0])); // {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int len = arr.length;
        List<int[]> mergeList = new ArrayList<>();
        mergeList.add(arr[0]);
        for (int i = 1; i < len; i++) {
            int[] next = arr[i];
            int[] previous = mergeList.get(mergeList.size() - 1);

            if (next[0] <= previous[1]) {
                // merge the array if any overlapping
                previous[1] = Math.max(previous[1], next[1]);
            } else {
                mergeList.add(arr[i]);
            }
        }

        return mergeList;

    }
}
