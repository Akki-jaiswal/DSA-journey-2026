package Arrays.Hard;

public class MaxProduct {
    static void main(String[] args) {
        int[] nums = {2,-3,2,4};
        int res = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];
        for (int i=1; i<nums.length; i++){
            int curr = nums[i];
            if (curr<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            res = Math.max(res,maxProd);
        }
        System.out.print(res);
    }
}
