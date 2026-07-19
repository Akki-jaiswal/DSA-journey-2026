package BitManipulation.InterviewProblems;

public class SingleNumber {
    public int[] singleNumber(int[] nums){
        int n = nums.length;
        long XOR = 0;
        for (int i=0; i<n; i++){
            XOR = XOR ^ nums[i];
        }
        int rightmost = (int)(XOR & (XOR-1))^(int)XOR;
        int XOR1 = 0, XOR2 =0;
        for (int i=0; i<n; i++){
            if ((nums[i] & rightmost) != 0){
                XOR1 = XOR1 ^ nums[i];
            }
            else {
                XOR2 = XOR2 ^ nums[i];
            }
        }
        if(XOR1 < XOR2) return new int[]{XOR1, XOR2};
        return new int[]{XOR2, XOR1};
    }
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 2};

        /* Creating an instance of
        Solution class */
        SingleNumber sol = new SingleNumber();

        /* Function call to get the single
        numbers in the given array */
        int[] ans = sol.singleNumber(nums);

        System.out.println("The single numbers in given array are: " + ans[0] + " and " + ans[1]);
    }

}
