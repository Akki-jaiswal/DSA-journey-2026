package StackQueues.Monotonic;

import java.util.Stack;

public class NGE_II {
    public int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=2*n-1; i>=0; i--){
            int ind = i%n;
            int currEle = arr[ind];
            while (!st.isEmpty() && st.peek() <= currEle){
                st.pop();
            }
            if (i<n){
                if (st.isEmpty()){
                    ans[ind] = -1;
                }
                else {
                    ans[ind] =st.pop();
                }
            }
            st.push(currEle);
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};

        // Create instance of Solution
        NGE_II sol = new NGE_II();

        // Call the function
        int[] ans = sol.nextGreaterElement(arr);

        System.out.print("The next greater elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
