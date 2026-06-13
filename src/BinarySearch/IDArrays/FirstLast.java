package BinarySearch.IDArrays;

import java.util.*;

public class FirstLast {
    static void main(String[] args) {
        List<Integer> v = Arrays.asList(3, 4, 13, 13, 13, 20, 40);
        int n = v.size();
        int key = 13;
        int start=0, end = n-1, res=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (v.get(mid)==key){
                res=mid;
                start=mid+1;
            }
            else if (key<v.get(mid)){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(res);
    }
}
