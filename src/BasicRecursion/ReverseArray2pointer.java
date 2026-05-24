package BasicRecursion;

public class ReverseArray2pointer {
    static void main() {

        int[] arr = {1,2,3,4,5};
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;

            for(int num : arr){
                System.out.println(num+" ");
            }
        }
    }
}
