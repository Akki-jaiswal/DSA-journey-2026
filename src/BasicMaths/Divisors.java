package BasicMaths;

import java.util.*;

public class Divisors {
    static void main() {
        int num = 36;
        List<Integer> res = new ArrayList<>();
//        BRUTE FORCE
//        for(int i = 1; i<=num; i++){
//            if(num%i == 0){
//                res.add(i);
//            }
//        }

//        Optimal Approach
        for(int i=1; i*i <= num; i++){
            if(num % i == 0){
                res.add(i);

                if(i != num / i){
                    res.add(num / i);
                }

            }
        }
        System.out.println(res);

    }
}
