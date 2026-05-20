package Patterns;

public class Pattern10 {
    static void main() {
        int N = 5;
        for(int i = 0; i <= N; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = N-1; i > 0; i-- ){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}