package Patterns;

public class Pattern11 {
    static void main() {
        int n = 5;
        int start;
        for(int i = 0; i < n; i++){
            if(i%2 == 0) start = 1;
            else start = 0;
            //inner loop
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
