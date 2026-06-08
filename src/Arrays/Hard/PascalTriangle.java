package Arrays.Hard;

public class PascalTriangle {
    static void main(String[] args) {
        int r = 5, c = 3;
        int n = r-1;
        int k = c-1;
        long result = 1;
        for(int i=0; i<k; i++){
                result*=(n-1);
                result/=(i+1);
        }
        System.out.println(result);
    }
}
