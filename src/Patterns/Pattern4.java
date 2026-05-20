package Patterns;

public class Pattern4 {
    static void main() {
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
