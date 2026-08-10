package TwoPointerSlidingWindow.Hard;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public String minWindow(String s, String t){
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c:t.toCharArray()){
            targetFreq.put(c, targetFreq.getOrDefault(c, 0)+1);
        }
        int required = targetFreq.size();
        int left=0, right=0;
        int formed=0;
        Map<Character, Integer> windowFreq = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        while (right<s.length()){
            char c = s.charAt(right);
            windowFreq.put(c, windowFreq.getOrDefault(c,0)+1);
            if (targetFreq.containsKey(c)&&windowFreq.get(c).intValue()==targetFreq.get(c).intValue()){
                formed++;
            }
            while(left<=right && formed==required){
                if ((right-left+1)<minLen){
                    minLen = right-left+1;
                    minLeft=left;
                }
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar)-1);
                if (targetFreq.containsKey(leftChar)&&windowFreq.get(leftChar)<targetFreq.get(leftChar)){
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen ==Integer.MAX_VALUE?"":s.substring(minLeft, minLeft+minLen);
    }
    static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinWindowSubstring sol = new MinWindowSubstring();
        System.out.println(sol.minWindow(s, t));  // Output: BANC
    }
}
