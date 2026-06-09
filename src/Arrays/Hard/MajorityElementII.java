package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    static void main(String[] args) {


        int[] arr = {2,1,1,3,1,4,5,6};
        int n = arr.length;
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            if(cnt1==0&&el2!=arr[i]){
                cnt1=i;
                el1=arr[i];
            }else if (cnt2==0 && el1!= arr[i]){
                cnt2 = 1;
                el2 = arr[i];
            }else if (arr[i] == el1) {
                cnt1++;
            }else if (arr[i]==el2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0; cnt2=0;
        for(int i=0; i<n; i++){
            if(arr[i]==el1) cnt1++;
            if(arr[i]==el2) cnt2++;
        }
        int mini = n/3+1;
        List<Integer> result = new ArrayList<>();
        if (cnt1>=mini) result.add(el1);
        if (cnt2>=mini && el1!=el2) result.add(el2);

        for(int it: result){
            System.out.println(result);
        }
    }
}