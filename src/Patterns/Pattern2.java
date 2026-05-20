package Patterns;

public class Pattern2 {
    static void main() {
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
