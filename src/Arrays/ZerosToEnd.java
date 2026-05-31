package Arrays;

public class ZerosToEnd {
    public void moveZeros(int[] arr){

        int j = -1;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    static void main(String[] args) {
        int[] arr = {0,1,0,2,3,5,0};
        ZerosToEnd sol = new ZerosToEnd();
        sol.moveZeros(arr);
        System.out.print("Array after moving zeroes: ");
        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
