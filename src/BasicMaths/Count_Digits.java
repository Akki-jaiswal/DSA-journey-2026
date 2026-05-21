package BasicMaths;

import java.util.Scanner;

public class Count_Digits {
    static void main() {
//        Brute-force --> (O(log10n + 1))
//        int counter;
//        int n = 23;
//        while(n>0){
//            counter++;
//            n = n / 10;
//        }
//        System.out.println(counter);

//        Optimal Approach -->(O(1))
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int count = (int)(Math.log10(n) + 1);
        System.out.println(count);

    }
}

