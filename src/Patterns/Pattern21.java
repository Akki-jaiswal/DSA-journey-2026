package Patterns;

public class Pattern21 {
    static void main() {
        int n=4;
//        BAD APPROACH
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i==1||i==4) System.out.print("*");
//                if(i==2&&j==2 || i==2&&j==3 || i==3&&j==2 || i==3&&j==3) System.out.print(" ");
//                if(j==1&&(i==2||i==3) || j==4&&(i==2||i==3)) System.out.print("*");
//
//            }

//        BEST APPROACH
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
