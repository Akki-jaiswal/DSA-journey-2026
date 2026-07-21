package BitManipulation.AdvancedMaths;

import BasicMaths.Prime;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesInRange {
    public ArrayList<Integer> primeInRange(ArrayList<int[]> queries){
        if (queries == null || queries.isEmpty()){
            return new ArrayList<>();
        }
        int maxVal = 0;
        for (int[] query:queries){
            maxVal = Math.max(maxVal, query[1]);
        }
        boolean[] isPrime = new boolean[maxVal+1];
        for (int i=2; i<=maxVal; i++){
            isPrime[i] = true;
        }
        for (int p=2; p*p<=maxVal; p++){
            if (isPrime[p]){
                for (int i=p*p; i<=maxVal; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        int[] primeCount = new int[maxVal+1];
        for (int i=1; i<=maxVal; i++){
            primeCount[i] = primeCount[i-1];
            if (isPrime[i]){
                primeCount[i]++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int[] query:queries){
            int start = query[0];
            int end = query[1];
            if (start==0){
                result.add(primeCount[end]);
            }
            else {
                result.add(primeCount[end] - primeCount[start-1]);
            }
        }
        return result;
    }
    static void main(String[] args) {
        ArrayList<int[]> queries = new ArrayList<>();
        queries.add(new int[]{2, 5});
        queries.add(new int[]{4, 7});

        // Creating an instance of Solution class
        PrimesInRange solution = new PrimesInRange();

        // Function call to find the number of primes in each range
        System.out.println(solution.primeInRange(queries)); // Output: [3, 2]
    }
}
