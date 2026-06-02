package Arrays;
import java.util.*;
    class LongestSubarray0sum {
        public int solve(int[] a) {
            // store best length found so far
            int maxLen = 0;
            // map prefix sum -> first index seen
            Map<Integer, Integer> sumIndexMap = new HashMap<>();
            // running prefix sum
            int sum = 0;

            // iterate through the array
            for (int i = 0; i < a.length; i++) {
                // update running sum
                sum += a[i];

                // if sum is zero, subarray [0..i] has zero sum
                if (sum == 0) {
                    // update best length
                    maxLen = i + 1;
                }
                // if this sum seen before, subarray (prevIndex..i] has zero sum
                else {
                    if (sumIndexMap.containsKey(sum)) {
                        // maximize length using previous index
                        maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
                    }
                    // first time seeing this sum, store its index
                    else {
                        sumIndexMap.put(sum, i);
                    }
                }
            }
            // return best length
            return maxLen;
        }
    // program entry
    public static void main(String[] args) {
        // sample input
        int[] a = {9, -3, 3, -1, 6, -5};
        // compute result
        int ans = new LongestSubarray0sum().solve(a);
        // print result
        System.out.println(ans);
    }

}