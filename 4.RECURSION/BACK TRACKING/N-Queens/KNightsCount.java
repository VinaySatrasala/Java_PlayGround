public class KNightsCount {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(Knights(board, 0, 0, n));
        System.out.println(cnt);
    }
    static int cnt = 0;
    static int Knights(boolean[][] board, int row, int col, int Knights) {
        if (Knights == 0) {
            display(board);
            System.out.println();
            cnt++;
            return 1;
        }

        if (row == board.length - 1 && col == board.length) {
            return 0;
        }

        int count = 0;
        if (col == board.length) {
            count+=Knights(board, row + 1, 0, Knights);
            return count;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count+=Knights(board, row, col+1, Knights - 1);
            board[row][col] = false;
        }

        count+=Knights(board, row, col + 1, Knights);

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row - 2, col -1) && board[row - 2][col - 1]){
            return false;
        }

        if(isValid(board, row - 2, col + 1) && board[row - 2][col + 1]){
            return false;
        }

        if(isValid(board, row - 1, col - 2) && board[row - 1][col - 2]){
            return false;
        }

        if(isValid(board, row + 1, col - 2) && board[row + 1][col - 2]){
            return false;
        }

        return true;
    }


    static boolean isValid(boolean[][] board,int row, int col){
        if(row <board.length && row >-1 && col <board.length && col >-1){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for (boolean[] bs : board) {
            for (boolean k : bs) {
                if (k) {
                    System.out.print("K ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
