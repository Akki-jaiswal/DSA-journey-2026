package Arrays.Medium;

public class RotateMatrix {
    public void rotateClockwise(int[][] matrix){
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RotateMatrix obj = new RotateMatrix();
        for(int[] row: matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println("After Rotating..");
        obj.rotateClockwise(matrix);
        for(int[] row: matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
