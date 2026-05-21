package Patterns;

public class Pattern13 {
    static void main() {
        int n = 5;
        int num = 1;
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
    }
}
