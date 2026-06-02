package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int i=0;
        int j=0;
        List<Integer> union = new ArrayList<>();
        while(i<arr1.length && j<arr2[j]){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                union.add(arr1[i]);
                i++;
                j++;
            }

        }
        System.out.println(union);
    }
}
