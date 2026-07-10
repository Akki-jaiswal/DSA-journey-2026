package Recursion.Hard;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    private boolean isPalindrome(String s, int start, int end){
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    private void backtrack(int index, String s, List<String> path, List<List<String>> res){
        if (index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i=index; i<s.length(); i++){
            if (isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                backtrack(i+1, s, path, res);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        // Start backtracking from index 0
        backtrack(0, s, path, res);
        return res;
    }

    void main(String[] args) {
    // Input string
    String s = "aab";
    // Create object of Solution
    PalindromePartitioning sol = new PalindromePartitioning();
    // Get all partitions
    List<List<String>> result = sol.partition(s);

    // Print the partitions
    for (List<String> part : result) {
        for (String str : part) {
            System.out.print(str + " ");
        }
        System.out.println();
        }
    }
}


