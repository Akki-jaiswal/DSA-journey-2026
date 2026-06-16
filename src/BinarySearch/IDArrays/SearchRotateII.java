package BinarySearch.IDArrays;

public class SearchRotateII {
    static void main(String[] args) {
        int[] arr = {7,2,1,2,3,3,3,4,5,6};
        int k = 3;
        int low = 0, high = arr.length-1;
        boolean found = false;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (arr[mid]==k){
                System.out.println("Element is at "+mid);
                found = true;
                break;
            }
            if (arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if (arr[low]<=arr[mid]){
                if (arr[low]<=k&&k<=arr[mid]){
                    high = mid - 1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if (arr[mid]<k && k<=arr[high]){
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

}