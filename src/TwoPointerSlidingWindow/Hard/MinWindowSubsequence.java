package TwoPointerSlidingWindow.Hard;

public class MinWindowSubsequence {
    public static String minWindow(String s, String t){
        int sLen = s.length();
        int tLen = t.length();
        int i=0, j=0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;
        while (i<sLen){
            if (s.charAt(i)==t.charAt(j)){
                j++;
                if (j==tLen){
                    int right=i;
                    j--;
                    while (j>=0){
                        if (s.charAt(i)==t.charAt(j)){
                            j--;
                        }
                        i--;
                    }
                    i++;
                    j++;
                    if ((right-i+1)<minLen){
                        minLen = right-i+1;
                        startIdx=i;
                    }
                }
            }
            i++;
        }
        return startIdx==-1?"":s.substring(startIdx, startIdx+minLen);
    }
    static void main(String[] args) {
        String s1 = "abcdebdde";
        String s2 = "bde";
        System.out.println("Minimum Window Subsequence: " + minWindow(s1, s2));
        // Output: "bcde"
    }
}
