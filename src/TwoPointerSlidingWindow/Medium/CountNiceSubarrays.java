package TwoPointerSlidingWindow.Medium;

public class CountNiceSubarrays {
    public int countAtMost(int[] nums, int k){
        int left=0, res=0;
        for (int right=0; right<nums.length; right++){
            if (nums[right]%2 != 0)
                k--;
            while (k<0){
                if (nums[left]%2 != 0)
                    k++;
                left++;
            }
            res+=(right-left+1);
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k){
        return countAtMost(nums, k) - countAtMost(nums, k-1);
    }
    static void main(String[] args) {
        CountNiceSubarrays sol = new CountNiceSubarrays();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(sol.numberOfSubarrays(nums, k));
    }
}
