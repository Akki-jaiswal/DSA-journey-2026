package Arrays.Medium;

public class RearrangeElements {
    static void main() {
        int[] arr = {1,2,-4,-5,6,-7};
        int n = arr.length;
        int[] ans = new int[n];
        int posIndex=0, negIndex=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }
        for(int num:ans)
            System.out.print(num+" ");
    }
}
