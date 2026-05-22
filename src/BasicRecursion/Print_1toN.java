package BasicRecursion;

public class Print_1toN {
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number --> forward rec.
        //System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);

        //Print current number --> BACKTRACKING.
        System.out.print(current+" ");
    }

        public static void main(String[] args) {
        Print_1toN sol = new Print_1toN();
        int n = 10;

        sol.printNumbers(1, n);
        System.out.println();
    }
}
