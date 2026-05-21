package Patterns;

public class Pattern14 {
    static void main() {
        char C = 'A';
        int n = 5;
        for(int i = 0; i < n; i++){
            for(char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
