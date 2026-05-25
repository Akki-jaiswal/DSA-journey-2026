package BasicHashing;
import java.util.*;

public class CharacterHashing {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int[] hash = new int[256];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0){
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
}
