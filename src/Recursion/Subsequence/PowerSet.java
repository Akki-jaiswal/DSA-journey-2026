package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    private void helper(String s, int index, StringBuilder current, List<String> result){
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }
        helper(s, index+1, current, result);
        current.append(s.charAt(index));
        helper(s, index+1, current, result);
        current.deleteCharAt(current.length()-1);
    }
    public List<String> getSubsequences(String s) {
        // List to store all subsequences
        List<String> result = new ArrayList<>();

        // StringBuilder to store current subsequence
        StringBuilder current = new StringBuilder();

        // Start recursion from index 0
        helper(s, 0, current, result);

        // Return list of subsequences
        return result;
    }
    static void main(String[] args) {
        // Input string
        String s = "abc";

        // Create Solution object
        PowerSet sol = new PowerSet();

        // Get all subsequences
        List<String> subsequences = sol.getSubsequences(s);

        // Print all subsequences
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
