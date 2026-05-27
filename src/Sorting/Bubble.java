package Sorting;

public class Bubble {
    static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        for(int i = n-1; i>=0; i--){
            boolean Swap = false;
            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    Swap = true;
                }
            }
            if(!Swap){
                break;
            }
        }
        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
