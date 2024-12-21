package OverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingMain {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        OverlappingInterval interval = new OverlappingInterval();
        List<int[]> finalList = interval.mergeIntervalExpectedApproach(arr);
        for (int[] inter : finalList) {
            System.out.println(inter[0] + ", " + inter[1]);
        }
    }
}
