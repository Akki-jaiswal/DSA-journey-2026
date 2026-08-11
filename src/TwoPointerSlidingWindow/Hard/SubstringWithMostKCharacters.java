package TwoPointerSlidingWindow.Hard;

import java.util.HashMap;
import java.util.Map;

public class SubstringWithMostKCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0 || s.length() == 0) return 0;
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right=0; right<s.length(); right++){
            char c=s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0));
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    static void main(String[] args) {
        SubstringWithMostKCharacters sol = new SubstringWithMostKCharacters();
        String s = "eceba";
        int k = 2;
        System.out.println(sol.lengthOfLongestSubstringKDistinct(s, k));
    }
}

