package Arrays;

import java.sql.SQLOutput;

public class LargestElement {
    static void main(String[] args) {
        int[] arr = {2,5,3,4,9,1};
        int max = arr[0];
        for(int i=0; i<arr.length -1; i++){
            if(arr[i]> max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
