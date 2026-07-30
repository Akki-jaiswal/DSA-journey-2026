package StackQueues.Monotonic;

import java.util.Stack;

public class AreaRectangle {
    public int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i=0; i<=n; i++){
            while (!stack.isEmpty()&&(i==n||heights[stack.peek()] >= (i<n?heights[i]:0))){
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                maxArea = Math.max(maxArea,height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    static void main(String[] args) {
        AreaRectangle sol = new AreaRectangle();
        int[] histo = {2, 1, 5, 6, 2, 3, 1};
        System.out.println("The largest area in the histogram is " + sol.largestRectangleArea(histo));
    }

}
