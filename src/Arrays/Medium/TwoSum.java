package Arrays.Medium;

import java.util.HashMap;

public class TwoSum {
    public String twoSumExists(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return "YES";
            }
            map.put(arr[i],i);
        }
        return "NO";
    }
    public int[] twoSumIndices(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        System.out.println(sol.twoSumExists(arr, target));
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
