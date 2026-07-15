package BitManipulation.Basics;

public class OddOrNot {
    public boolean isOdd(int n) {
        return n % 2 != 0;  // Return true if the number is odd, else false
    }
    static void main(String[] args) {
        OddOrNot sol = new OddOrNot();
        int num = 7;

        if (sol.isOdd(num)) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is not odd.");
        }
    }
}
