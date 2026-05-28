package Sorting;

public class QuickSort {
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            qs(arr, low, pivotIndex - 1);
            qs(arr, pivotIndex + 1, high);
        }
    }

    static void main (String[]args){
            // Input array
            int[] arr = {10, 7, 8, 9, 1, 5};

            // Create object
            QuickSort sol = new QuickSort();

            // Call quickSort
            sol.qs(arr, 0, arr.length - 1);

            // Print sorted array
            for (int num : arr)
                System.out.print(num + " ");
        }
    }