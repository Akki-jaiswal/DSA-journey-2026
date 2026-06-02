package Arrays;

public class SecondLargest {
    static void main(String[] args) {
        int[] arr = {9,2,5,1,5,4};
        int n = arr.length;
        int sLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] > sLargest && arr[i]!=largest){
                sLargest=arr[i];
            }
        }
        System.out.println(sLargest);
    }
}
