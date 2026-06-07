package Arrays.Medium;

import java.util.HashMap;

public class SubArraySumEqualsK {
    static void main(String[] args) {
        int [] arr= {3,1,2,4,2};
        int k =9;
        int n = arr.length;
        HashMap<Integer,Integer> prefixSumCount = new HashMap<>();
        int prefixSum=0, count=0;
        prefixSumCount.put(0,1);

        for(int i=0; i<n; i++){
            prefixSum+=arr[i];
            int remove = prefixSum-k;
            if(prefixSumCount.containsKey(remove)){
                count+=prefixSumCount.get(remove);
            }
            prefixSumCount.put(prefixSum,prefixSumCount.getOrDefault(prefixSum,0)+1);
        }
        System.out.println(count);
    }
}
