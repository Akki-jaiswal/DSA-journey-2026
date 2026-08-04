package TwoPointerSlidingWindow.Medium;

import java.util.Arrays;

public class SubstringWithoutRepeatingChar {
    public int longestNonRepeatingSubstring(String s){
        int n = s.length();
        int HashLen = 256;
        int[] hash = new int[HashLen];
        Arrays.fill(hash, -1);
        int l=0, r=0, maxLen=0;
        while (r<n){
            if (hash[s.charAt(r)]>=l){
                l = Math.max(hash[s.charAt(r)]+1,l);
            }
            int len = r-l+1;
            maxLen = Math.max(len, maxLen);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
    static void main(String[] args) {
        String s = "cadbzabcd";

        // Create an instance of the Solution class
        SubstringWithoutRepeatingChar sol = new SubstringWithoutRepeatingChar();

        int result = sol.longestNonRepeatingSubstring(s);

        // Output the maximum length
        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}
