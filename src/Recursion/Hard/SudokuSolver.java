package Recursion.Hard;

public class SudokuSolver {
    public boolean isValid(char[][] board, int row, int col, char c){
        for(int i=0; i<9; i++){
            if (board[i][col]==c) return false;
        }
        for (int j=0; j<9; j++){
            if (board[row][j] == c) return false;
        }
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);

        // Check 3x3 box for duplicates
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRowStart + i][boxColStart + j] == c) return false;
            }
        }
        return true;
    }
    public boolean solveSudoku(char[][] board){
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (board[i][j]=='.'){
                    for (char c='1'; c<='9'; c++){
                        if(isValid(board,i, j, c)){
                            board[i][j] = c;
                            if (solveSudoku(board)) return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static void main(String[] args) {
        char[][] board = {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        SudokuSolver sol = new SudokuSolver();
        sol.solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            // Print a horizontal divider after every 3rd row (except the first one)
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < 9; j++) {
                // Print a vertical divider after every 3rd column (except the first one)
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
