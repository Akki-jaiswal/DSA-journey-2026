package BasicRecursion;
import java.util.*;
public class ReverseArray {
    public int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }

    public static void main(String[] args) {
                // Input array
                int[] arr = {1, 2, 3, 4, 5};

                // Create object of Solution class
                ReverseArray obj = new ReverseArray();

                // Call the reverseArray function
                int[] result = obj.reverseArray(arr);

                // Print the reversed array
                System.out.print("Reversed Array: ");
                for (int num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
    }
}
