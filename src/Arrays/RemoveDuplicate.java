package Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        int unique_count = i+1;
        System.out.println("Unique count = " + unique_count);
        System.out.println("Array after removing duplicates: ");
        for(int num=0; num<unique_count; num++){
            System.out.println(num);
        }
    }
}
