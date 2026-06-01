package Arrays;

public class MaxConsecutiveOnes {
    static void main(String[] args) {
        int count1 = 0;
        int count0 = 0;
        int max_count1 = 0;
        int max_count2 = 0;
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
                count0 = 0;
            } else{
                count1 = 0;
                count0++;
            }
            max_count1 = Math.max(max_count1,count1);
            max_count2 = Math.max(max_count2,count0);
        }
        System.out.println(max_count1);
        System.out.println(max_count2);
    }
}