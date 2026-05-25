package BasicRecursion;

public class Fibonacci {
    public static void fib(int N) {
        int a = 0, b = 1;
        for (int i = 0; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    static void main(String[] args) {
        int N;
        N = 30;
        fib(N);


    }


}
