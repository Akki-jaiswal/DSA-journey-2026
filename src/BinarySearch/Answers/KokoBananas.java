package BinarySearch.Answers;

import java.util.Arrays;

public class KokoBananas {
    private int calculateTotalHours(int[] piles, int speed){
        int totalH=0;
        for (int bananas : piles){
            totalH += (int)Math.ceil((double)bananas/speed);
        }
        return totalH;
    }
    private int minEatingSpeed(int[] piles, int h){
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1, high = maxPile;
        int ans = maxPile;
        while (low<=high){
            int mid=(low+high)/2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH<=h){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h=8;
        KokoBananas obj = new KokoBananas();
        System.out.println(obj.minEatingSpeed(piles,h));
    }
}
