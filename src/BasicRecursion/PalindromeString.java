package BasicRecursion;

public class PalindromeString {
//        NORMAL APPROACH
//        boolean ans = true;
//
//        int left = 0, right = str.length() - 1;
//        while(left < right){
//            if(!Character.isLetterOrDigit(str.charAt(left)))
//                left++;
//            else if (!Character.isLetterOrDigit(str.charAt(right)))
//                right--;
//            else if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
//                ans = false;
//                break;
//            }
//            else{
//                left++;
//                right--;
//            }
//        }
//
//        if(ans) System.out.println("true");
//        else System.out.println("false");

//        OPTIMAL APPROACH

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "ABCDCBA";
        if(isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("palindrome");
        } else System.out.println("not a palindrome");
    }
}
