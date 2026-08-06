package TwoPointerSlidingWindow.Medium;

public class ReplaceLongestRepeatingChar {
    public int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int left=0, right=0;
        int maxCount=0, maxLength=0;
        while (right<s.length()){
            freq[s.charAt(right)-'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(right)-'A']);
            while ((right-left+1)-maxCount>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
    static void main(String[] args) {
        ReplaceLongestRepeatingChar sol = new ReplaceLongestRepeatingChar();
        String s = "AABABBA";
        int k = 1;
        // Output: 4
        System.out.println(sol.characterReplacement(s, k));
    }
}
