package Arrays.Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
    static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int n = nums.length;
        if (n == 0) System.out.println(0);
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }
        for(int it:st){
            if (!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println(longest);
    }
}
