package Patterns;

public class Pattern20 {
    static void main() {
        int n = 5;
//        first part of butterfly
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        second part of butterfly
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
