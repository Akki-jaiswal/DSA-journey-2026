package Arrays.Medium;

public class Next_Permutation {
    public void nextPermutation(int[] nums){
        int index=-1;
        for(int i=nums.length-2; i>=2;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1; i>index; i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
    private void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void main(String[] args) {
        int[] nums = {1,2,0,5,3};
        Next_Permutation obj = new Next_Permutation();
        obj.nextPermutation(nums);
        for(int num:nums){
            System.out.println(num+" ");
        }
        System.out.println();
    }
}