package Patterns;

public class Pattern16 {
    static void main() {
        int n = 5;
        char ch = 'A';
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
}
