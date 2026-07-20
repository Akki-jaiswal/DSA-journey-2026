package BitManipulation.AdvancedMaths;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public List<Integer> getDivisors(int N){
        List<Integer> res = new ArrayList<>();
        for (int i=1; i*i<=N;i++){
            if (N%i==0){
                res.add(i);
                if (i!=N/i)
                    res.add(N/i);
            }
        }
        return res;
    }
    static void main(String[] args) {
        // Create object of Solution class
        PrintDivisors sol = new PrintDivisors();
        int N = 36;
        List<Integer> result = sol.getDivisors(N);

        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }}
