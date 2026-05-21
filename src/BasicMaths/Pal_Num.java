package BasicMaths;

public class Pal_Num {
    static void main() {
        int Orig_num = 23432;
        int num = 23423;
        int rev_num = 0;
        while(num>0){
            int last_digit = num%10;
            num = num/10;
            rev_num = (rev_num*10) + last_digit;
        }
        if(Orig_num == rev_num){
            System.out.println("No. is a palindrome.");
        }
        else System.out.println("Not a palindrome.");
    }
}
