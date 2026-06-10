package Arrays.Hard;

public class SortedArrayNoSpace {
    static void main(String[] args) {
        int[] num1 = {1,3,5,0,0,0};
        int[] num2 = {2,4,6};
        int m=3, n=3;
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if (num1[i]>num2[j]){
                num1[k--] = num1[i--];
            } else{
                num1[k--]=num2[j--];
            }

        }
        for (int num:num1){
            System.out.print(num+" ");
        }

    }
}
