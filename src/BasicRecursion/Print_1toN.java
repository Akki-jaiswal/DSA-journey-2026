package BasicRecursion;

public class Print_1toN {
    public void printNumbers(int current) {
        // Base case: if current exceeds n, stop recursion
        if (current < 1)
            return;

        // Print current number --> forward rec.
//        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current - 1);

        //Print current number --> BACKTRACKING.
        System.out.print(current+" ");
    }

        public static void main(String[] args) {
        Print_1toN sol = new Print_1toN();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}
