package BasicMaths;
import java.util.Scanner;
public class Armstrong {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int Orig_num = sc.nextInt();
        int num = Orig_num;
        int sum = 0;
        int count = (int)(Math.log10(num) + 1);
        System.out.println(count);
        while(num>0){
            int last_digit = num%10;
            sum += Math.pow(last_digit, count);
            num = num / 10;
        }
        if(Orig_num == sum){
            System.out.println("armstrong no");
        }else System.out.println("not a armstrong no.");
    }
}
