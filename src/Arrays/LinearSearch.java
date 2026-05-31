package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {

        int[] arr = {23, 12, 25, 65, 19};
        int n = arr.length;
        boolean ans = false;
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(ele==arr[i]){
                System.out.println(i);
                ans = true;
            }
        }
        if(!ans){
            System.out.println(-1);
        }

    }
}