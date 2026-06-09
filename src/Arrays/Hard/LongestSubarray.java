package Arrays.Hard;

import java.util.*;

public class LongestSubarray {
    static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            // update running sum
            sum += arr[i];

            // if sum is zero, subarray [0..i] has zero sum
            if (sum == 0) {
                // update best length
                maxi = i + 1;
            }
            // otherwise check if this sum was seen before
            else if (mpp.containsKey(sum)) {
                    // maximize length
                    maxi = Math.max(maxi, i - mpp.get(sum));
            }
                // first time seeing this sum
            else {
                    // record index
                    mpp.put(sum, i);
            }
        }
        System.out.println(maxi);
    }
}
