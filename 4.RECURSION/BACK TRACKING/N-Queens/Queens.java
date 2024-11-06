import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queens{
    public static void main(String[] args) {
        int n = 9;
        boolean[][] board = new boolean[n][n];
        System.out.println(f(board, 0));
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        System.out.println(f(board, 0));
        return ans;
    }
    static int  f(boolean[][] board , int row){
        if(row == board.length){
            for (boolean[] bs : board) {
                for (boolean q : bs) {
                    if(q){
                        System.out.print(" Q ");
                    }else{
                        System.out.print(" _ ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0;col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += f(board, row+1);
                board[row][col] = false;

            }
        }
        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // Row Checking
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        // Left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]){
                return false;
            }
        }


        // Right diagonal
        int maxRight = Math.min(row,board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }

}