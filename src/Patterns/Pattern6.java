package Patterns;

public class Pattern5 {
    static void main() {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
