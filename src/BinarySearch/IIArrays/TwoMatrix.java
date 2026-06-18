package BinarySearch.IIArrays;

public class TwoMatrix {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 8;
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = n*m-1;
        while (low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if (matrix[row][col]==target){
                System.out.println("Found!! at row " +(row)+" col "+(col));
                return;
            }
            else if (matrix[row][col]<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        System.out.println("Not found!!");
    }
}
