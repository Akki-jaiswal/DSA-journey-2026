package Recursion.Subsequence;

public class CountAllSumK {
    public int func(int ind, int sum, int[] nums){
        if (sum==0) return 1;
        if (sum<0||ind==nums.length) return 0;
        return func(ind+1, sum-nums[ind],nums) + func(ind+1,sum, nums);
    }
    public int countSubTargetSum(int[] nums, int target){
        return func(0, target, nums);
    }
    static void main(String[] args){
        CountAllSumK sol = new CountAllSumK();
        int[] nums1 = {1,2,3,4};
        int target = 5;
        System.out.println("Number of subsequences with target sum " + target + ": "
                + sol.countSubTargetSum(nums1, target));
    }
}
