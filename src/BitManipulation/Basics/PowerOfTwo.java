package BitManipulation.Basics;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        return n>0 && (n&(n-1)) == 0;
    }
    static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();
        int num = 8;

        if (sol.isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
