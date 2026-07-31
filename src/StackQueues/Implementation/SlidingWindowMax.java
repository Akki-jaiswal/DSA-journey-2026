package StackQueues.Implementation;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMax {
    public List<Integer> maxSlidingWindow(int[] nums, int k){
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i=0; i< nums.length; i++){
            if (!dq.isEmpty()&&dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while (!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i>=k-1){
                result.add(nums[dq.peekFirst()]);
            }
        }
        return result;
    }
    static void main(String[] args) {
        SlidingWindowMax obj = new SlidingWindowMax();
        int[] arr = {1,3,1,2,0,5};
        int k = 3;
        List<Integer> ans = obj.maxSlidingWindow(arr, k);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
