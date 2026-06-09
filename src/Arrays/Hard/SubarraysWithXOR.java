package Arrays.Hard;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithXOR {
    static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        int k = 6;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0,1);
        int prefixXor = 0;
        int count = 0;

        for (int num:arr){
            prefixXor^=num;
            int target = prefixXor^k;
            if(freq.containsKey(target)){
                count+=freq.get(target);
            }
            freq.put(prefixXor, freq.getOrDefault(prefixXor,0)+1);
        }
        System.out.println(count);
    }
}
