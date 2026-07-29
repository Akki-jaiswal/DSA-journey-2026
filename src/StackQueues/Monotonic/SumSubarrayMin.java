package StackQueues.Monotonic;

import java.util.Stack;

public class SumSubarrayMin {
        // Helper function to find Next Smaller Element (NSE) indices
        private int[] findNSE(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            // Traverse the array from right to left
            for (int i = n - 1; i >= 0; i--) {
                // Pop elements that are greater than or equal to current element
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }
                // If stack is empty, there is no smaller element to the right
                ans[i] = !st.isEmpty() ? st.peek() : n;
                st.push(i);
            }
            return ans;
        }

        // Helper function to find Previous Smaller or Equal Element (PSEE) indices
        private int[] findPSEE(int[] arr) {
            int n = arr.length;
            int[] ans = new int[n];
            Stack<Integer> st = new Stack<>();

            // Traverse the array from left to right
            for (int i = 0; i < n; i++) {
                // Pop elements strictly greater than current element (handles duplicates)
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    st.pop();
                }
                // If stack is empty, there is no smaller/equal element to the left
                ans[i] = !st.isEmpty() ? st.peek() : -1;
                st.push(i);
            }
            return ans;
        }

        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;
            int[] nse = findNSE(arr);
            int[] psee = findPSEE(arr);

            long sum = 0;
            int mod = (int) 1e9 + 7;

            for (int i = 0; i < n; i++) {
                long leftCount = i - psee[i];
                long rightCount = nse[i] - i;

                // Total subarrays where arr[i] is the minimum
                long count = (leftCount * rightCount) % mod;

                // Add the contribution of arr[i] to the total sum
                sum = (sum + (count * arr[i]) % mod) % mod;
            }

            return (int) sum;
    }
}
