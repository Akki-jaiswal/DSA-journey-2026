package Patterns;

public class Pattern22 {
    static void main() {
        int n=4;
        for(int i=0; i<=2*n - 2; i++){
            for(int j=0; j<=2*n - 2; j++){
                int top = i;
                int left = (2*n-2)-i;
                int bottom = j;
                int right = (2*n-2)-j;
                int minDist = Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print((n-minDist)+" ");
            }
            System.out.println();
        }
    }
}
