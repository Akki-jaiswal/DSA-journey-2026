package BinarySearch.IDArrays;

public class SearchInsert {
    static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int x=3;
        int n = arr.length;
        int low = 0, high = n-1;
        int ans=n;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
