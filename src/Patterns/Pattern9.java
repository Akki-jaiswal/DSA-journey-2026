package patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int N = 5;
        Pattern9 p = new Pattern9();

        p.erectPyramid(N);
        p.invertedPyramid(N);
    }

    public void erectPyramid(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void invertedPyramid(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}