package BinarySearch.IIArrays;

public class TwoMatrixII {
    private int[][] matrix;
    public TwoMatrixII(int[][] matrix){
        this.matrix = matrix;
    }
    public boolean searchElement(int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int row=0, col=m-1;
        while (row<n&&col>=0){
            if (matrix[row][col]==target){
                return true;
            }
            else if (matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
    static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        TwoMatrixII ms = new TwoMatrixII(matrix);
        boolean found = ms.searchElement(8);
        System.out.println(found);
    }
}

