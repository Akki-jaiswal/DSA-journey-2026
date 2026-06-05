package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaders {
    static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] nums = {10,22,12,3,0,6};
        if(nums.length==0){
            System.out.println(ans);
        }
        int max = nums[nums.length-1];
        ans.add(nums[nums.length - 1]);
        for(int i = nums.length-2; i>=0;i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
