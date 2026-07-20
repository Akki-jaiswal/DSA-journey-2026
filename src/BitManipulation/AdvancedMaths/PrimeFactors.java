package BitManipulation.AdvancedMaths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> primeFactors(int n){
    List<Integer> factors = new ArrayList<>();
    for (int i=2; i*i<=n; i++){
        while(n%i==0){
            factors.add(i);
            n/=i;
        }
    }
    if (n>1){
        factors.add(n);
    }
    return factors;
    }
    static void main(String[] args) {
        int n = 60;
        System.out.println("Prime factors of " + n + ": " + primeFactors(n));
    }
}
