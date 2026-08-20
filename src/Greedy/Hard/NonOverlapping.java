package Greedy.Hard;

import java.util.Arrays;

public class NonOverlapping {
    public int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals, (a,b)->Integer.compare(a[1],b[1]));
        int count = 0;
        int prevEnd = intervals[0][1];
        for (int i=1; i<intervals.length; i++){
            if (intervals[i][0] < prevEnd){
                count++;
            }
            else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
    static void main(String[] args) {
        NonOverlapping sol = new NonOverlapping();

        // Sample input
        int[][] intervals = { {1, 3}, {2, 4}, {3, 5}, {1, 2} };

        // Output result
        System.out.println("Minimum number of intervals to remove: " + sol.eraseOverlapIntervals(intervals));
    }
}
