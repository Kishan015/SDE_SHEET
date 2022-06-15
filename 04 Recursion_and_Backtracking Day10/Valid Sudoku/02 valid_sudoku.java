
class Solution {
     public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        solve(board);
    }

    public boolean solve(char[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell

                            if(solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

      private boolean isValid(char[][] board, int row, int col, char c){
        int nRow = 3 * (row / 3);  // normalized row
        int nCol = 3 * (col / 3);    // normalized col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false; //check row
            if (board[row][i] == c) return false; //check column
            if (board[nRow + i / 3][nCol + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
}

// Chinese girl code 


class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }

    private boolean helper(char[][] b) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (b[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++) {
                        if (isValid(b, i, j, k)) {
                            b[i][j] = k;
                            if (helper(b)) return true;
                            b[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] b, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (b[i][col] == c) return false;
            if (b[row][i] == c) return false;
            if (b[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }

        return true;
    }
}
