package Sorting;
import java.util.*;

public class Merge {
    public void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }
        while(left <= mid)
            temp.add(arr[left++]);
        while(right <= high)
            temp.add(arr[right++]);

        for(int i=low; i<=high; i++)
            arr[i] = temp.get(i-low);
    }
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        // Find mid index
        int mid = (low + high) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }
    static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        Merge sol = new Merge();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
