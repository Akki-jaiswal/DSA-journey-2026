package Patterns;

public class Pattern18 {
    static void main() {
        int n = 5;
        for(int i=0; i<n; i++){
            char ch= (char)('A'+n-1-i);
            char ch2 = (char)('A'+n-1);
            for(char j=ch; j<=ch2; j++){

                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
