package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List spiralOrder(int[][] matrix) {
        List result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
        }
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--; // Move the bottom boundary upward
        }

        // Traverse the left column from bottom to top (only if columns remain)
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++; // Move the left boundary rightward
        }
        return result;
    }

    static void main(String[] args) {
    SpiralMatrix obj = new SpiralMatrix();        // Input matrix
        int[][] matrix = {
                { 1,  2,  3,  4 },
                { 5,  6,  7,  8 },
                { 9, 10, 11, 12 },
                { 13,14, 15, 16 }
        };

        // Call spiralOrder function
        List ans = obj.spiralOrder(matrix);

        // Print result
        System.out.println(ans);
    }
}