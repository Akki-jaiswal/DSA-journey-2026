package Greedy.Hard;

import java.util.Arrays;

public class MinPlatformsForRailway {
    public int countPlatforms(int n, int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 1;
        int result = 1;
        int  i=1, j=0;
        while (i<n && j<n){
            if (arr[i]<=dep[j]){
                platforms++;
                i++;
            }
            else {
                platforms--;
                j++;
            }
            result = Math.max(result, platforms);
        }
        return result;
    }
    static void main(String[] args) {
        int[] arr = {900, 945, 955, 1100, 1500, 1800};
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000};
        int n = arr.length;

        MinPlatformsForRailway obj = new MinPlatformsForRailway();
        System.out.println("Minimum number of Platforms required " +
                obj.countPlatforms(n, arr, dep));
    }
}
