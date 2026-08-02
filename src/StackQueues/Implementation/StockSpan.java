package StackQueues.Implementation;

import java.util.Stack;

public class StockSpan {
    private int[] findPGE(int[] arr){
        int n = arr.length;
        int[] ans  = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0; i<n; i++){
            int currEle = arr[i];
            while(!st.isEmpty() && arr[st.peek()]<=currEle){
                st.pop();
            }
            if (st.isEmpty())
                ans[i] = -1;
            else ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }

    public int[] stockSpan(int[] arr, int n){
        int[] PGE = findPGE(arr);
        int[] ans = new int[n];
        for (int i = 0; i<n; i++){
            ans[i] = i-PGE[i];
        }
        return ans;
    }
    static void main(String[] args) {
        int n = 7; // Number of days
        int[] arr = {120, 100, 60, 80, 90, 110, 115}; // Stock prices for each day

        StockSpan sol = new StockSpan();
        int[] ans = sol.stockSpan(arr, n);

        System.out.print("The span of stock prices is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " "); // Display the span of each day
        }
    }
}
