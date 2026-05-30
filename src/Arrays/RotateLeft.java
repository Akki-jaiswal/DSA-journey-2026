package Arrays;

public class RotateLeft {
    static void main(String[] args) {
        int n=5;
        int[] arr = {1,2,3,4,5};
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1; i<n; i++){
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        for(int i=0; i<n; i++){
            System.out.print(temp[i]+" ");
        }

    }
}
