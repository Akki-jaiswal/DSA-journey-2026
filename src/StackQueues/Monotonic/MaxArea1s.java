package StackQueues.Monotonic;

import java.util.Arrays;
import java.util.Stack;

public class MaxArea1s {
    public int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int[] newHeights = Arrays.copyOf(heights, heights.length+1);
        for (int i=0;i<newHeights.length; i++){
            while (!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int height = newHeights[stack.pop()];
                int width = stack.isEmpty()?i:i-stack.peek()-1;
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix){
        if (matrix.length==0) return 0;
        int m = matrix[0].length;
        int[] height = new int[m];
        int maxArea = 0;
        for (char[] row:matrix){
            for (int i=0; i<m; i++){
                if (row[i]=='1') height[i]++;
                else height[i]=0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        return maxArea;
    }
    static void main(String[] args) {

        // Sample matrix input
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };

        MaxArea1s sol = new MaxArea1s();

        // Call the function and print result
        System.out.println(sol.maximalRectangle(matrix));
    }
}
