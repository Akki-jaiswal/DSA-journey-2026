package TwoPointerSlidingWindow.Medium;

public class BinarySubarraySum {
    public int numSubarraysWithSum(int[] nums, int goal){
        return atMost(nums, goal)-atMost(nums, goal-1);
    }
    private int atMost(int[] nums, int k){
        if (k<0) return 0;
        int left=0, sum=0, count=0;
        for (int right=0; right<nums.length; right++){
            sum += nums[right];
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
    static void main(String[] args) {
        BinarySubarraySum sol = new BinarySubarraySum();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(sol.numSubarraysWithSum(nums, goal)); // Output: 4
    }
}
