package BinarySearch.IDArrays;

public class MinRotatedSorted {
    static void main(String[] args) {
        int[] nums = {4,5,6,7,0,-1,2};
        int low=0,high=nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if (nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high=mid;
            }
        }
        System.out.println(nums[low]);
    }
}
