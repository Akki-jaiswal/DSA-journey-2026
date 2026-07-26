package StackQueues.Monotonic;

import java.util.Stack;

public class NGE {
    public int[] nextGreater(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];
        for (int i=n-1; i>=0; i--){
            while (!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(nums[i]);
        }
        return res;
    }
    static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        NGE sol = new NGE();
        int[] ans = sol.nextGreater(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
