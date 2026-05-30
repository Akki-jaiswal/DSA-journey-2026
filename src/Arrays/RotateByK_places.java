package Arrays;

import java.util.Arrays;

public class RotateByK_places {
    void reverseArray(int[] nums, int start, int end) {
        // Swap elements until start meets end
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public int[] rotateArray(int[] arr, int k, String direction) {
        int n = arr.length;
        if (n == 0 || k == 0) return arr;
        k = k % n;
        if (direction.equals("right")) {
            reverseArray(arr, 0, n - 1);
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
        } else if (direction.equals("left")) {
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
            reverseArray(arr, 0, n - 1);
        }
        return arr;
    }


    public static void main(String[] args) {
        RotateByK_places sol = new RotateByK_places();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        String direction = "right";

        // Call rotateArray and store result
        int[] result = sol.rotateArray(arr, k, direction);

        // Print rotated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
