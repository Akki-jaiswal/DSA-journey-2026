package BitManipulation.Basics;

public class Swap {
    public void swapXOR(int[] arr){
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }
    static void main(String[] args){
        int[] nums = {5, 10};
        Swap swapper = new Swap();
        System.out.println("a = "+nums[0]+", b= "+nums[1]);
        swapper.swapXOR(nums);
        System.out.println("a = "+nums[0]+", b= "+nums[1]);
    }
}
