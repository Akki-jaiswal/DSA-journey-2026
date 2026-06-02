package Arrays;

public class RotateLeft {
    static void main(String[] args) {
        int n=5;
        int[] arr = {1,2,3,4,5};
        int temp = arr[0];
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
