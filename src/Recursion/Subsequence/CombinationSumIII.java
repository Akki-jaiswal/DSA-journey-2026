package Recursion.Subsequence;

import java.util.*;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        // Start backtracking from the number 1, with target sum n
        backtrack(n, 1, k, currentCombination, result);
        return result;
    }
    private void backtrack(int remainingSum, int startNum, int k,
                           List<Integer> current, List<List<Integer>> result) {

        // Base Case 1: If we have successfully found k numbers that sum to n
        if (remainingSum == 0 && current.size() == k) {
            // Create a copy of the current combination and add it to the final result
            result.add(new ArrayList<>(current));
            return;
        }
        if (remainingSum <= 0 || current.size() > k) {
            return;
        }
        for (int i = startNum; i <= 9; i++) {
            // Optimization: If the number is greater than the remaining sum,
            // no point in checking it or any larger numbers.
            if (i > remainingSum) {
                break;
            }
            // 1. Choose: Add the current number to the path
            current.add(i);
            // 2. Explore: Recurse with the next number (i + 1) and updated sum
            backtrack(remainingSum - i, i + 1, k, current, result);
            // 3. Backtrack: Remove the last added number to try other options
            current.remove(current.size() - 1);
        }
    }
}
