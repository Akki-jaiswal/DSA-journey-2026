package Recursion.Hard;

import java.util.*;

public class WordBreak {
    public class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();

            // 1. Convert list to HashSet for O(1) lookups
            Set<String> wordSet = new HashSet<>(wordDict);

            // 2. Find the maximum length of a word in the dictionary (Optimization)
            int maxWordLength = 0;
            for (String word : wordDict) {
                maxWordLength = Math.max(maxWordLength, word.length());
            }

            // 3. Initialize the dp array
            // dp[i] represents if the prefix s[0...i-1] can be segmented
            boolean[] dp = new boolean[n + 1];
            dp[0] = true; // Base Case: Empty string

            // 4. Fill the DP table
            for (int i = 1; i <= n; i++) {
                // j starts from i-1 down to 0, but only as far back as maxWordLength
                for (int j = i - 1; j >= 0; j--) {
                    // Optimization: If substring length exceeds the longest dictionary word, break
                    if (i - j > maxWordLength) {
                        break;
                    }

                    // If s[0...j-1] is segmentable (dp[j]) and s[j...i-1] is in dictionary
                    if (dp[j] && wordSet.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break; // No need to check other partition points for index i
                    }
                }
            }

            return dp[n];
        }
    }
}
