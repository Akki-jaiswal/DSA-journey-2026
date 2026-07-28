package StackQueues.Monotonic;

import java.util.Arrays;

public class NSE {
    public int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i=0; i<n; i++){
            int curr = arr[i];
            for (int j=i+1;j<n;j++){
                if (arr[j]<curr){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
    static void main(String[] args) {
        // Input array
        int[] arr = {4, 8, 5, 2, 25};

        // Create object of Solution
        NSE sol = new NSE();

        // Call function to get next smaller elements
        int[] ans = sol.nextSmallerElement(arr);

        // Print the result
        System.out.print("The next smaller elements are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
