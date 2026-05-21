package BasicMaths;

public class Reverse {
    static void main() {
        int num = 76754;
        int rev_Num = 0;
        System.out.println("original no.:"+num);
        while(num>0){
            int last_digit = num%10;
            num = num/10;
            rev_Num = (rev_Num*10)+last_digit;
            System.out.println(rev_Num); //for better clarity
        }
        System.out.println("final no:" +rev_Num);
    }
}
