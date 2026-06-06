package Arrays.Medium;

public class MatrixZero {
    public void setZeroes(int[][] matrix) {
        int m =  matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0){
                firstRowZero=true;
                break;
            }
        }
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero){
            for (int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColZero){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
    static void main(String[] args) {
        MatrixZero m = new MatrixZero();
        int[][] matrix = {{0,1,2,7},{3,1,8,2},{1,3,1,0}};
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();

        }
        System.out.println("AFTER MAKING ZEROES");
        m.setZeroes(matrix);
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
