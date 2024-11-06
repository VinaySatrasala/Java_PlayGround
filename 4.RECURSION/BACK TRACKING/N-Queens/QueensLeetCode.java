import java.util.ArrayList;
import java.util.List;

public class QueensLeetCode {
    public static void main(String[] args) {
        System.out.println(solveNQueens(1));
    }
    static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        f(board, 0,ans);
        return ans;
    }
    static void f(boolean[][] board , int row , List<List<String>> ans){
        if(row == board.length){
            List<String> innerList = new ArrayList<>();
            for (boolean[] bs : board) {
                String temp = "";
                for (boolean q : bs) {
                    if(q){
                        temp += "Q";
                    }else{
                        temp += ".";
                    }
                }
                innerList.add(temp);
            }
            ans.add(innerList);
            System.out.println("hello");
            return;
        }
        for(int col = 0;col < board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                f(board,row+1,ans);
                board[row][col] = false;
            }
        }

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
