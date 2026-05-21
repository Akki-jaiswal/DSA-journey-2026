package Patterns;

public class Pattern15 {
    static void main() {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(char j = 'A'; j <= 'A'+ (n-i-1); j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

}
