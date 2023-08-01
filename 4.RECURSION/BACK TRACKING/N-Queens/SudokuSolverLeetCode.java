public class SudokuSolverLeetCode {
    public static void main(String[] args) {
        for (int num = 1; num <= 9; num++) {
            char ch  = num  + '0';
            System.out.println(ch);
        }
    }

    static void solveSudoku(char[][] board) {
        solver(board);
    }
    static boolean solver(char[][] sudoku) {
        int n = sudoku.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sudoku[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        if (emptyLeft) {
            return true;
        }

        for (char num = '1'; num <= '9'; num+='1') {
            if (isSafe(sudoku, num, row, col)) {
                sudoku[row][col] = num;
                if (solver(sudoku)) {
                    return true;
                } else {
                    sudoku[row][col] = (char)0;
                }
            }
        }

        return false;

    }

    static boolean isSafe(char[][] sudoku, char ch, int row, int col) {
        // Row and Col
        for (int i = 0; i < sudoku.length; i++) {
            if (ch == sudoku[row][i]) {
                return false;
            }
            if (ch == sudoku[i][col]) {
                return false;
            }
        }

        // Stride
        int strideRow = (row / 3) * 3;
        int StrideCol = (col / 3) * 3;
        for (int i = strideRow; i < strideRow + 3; i++) {
            for (int j = StrideCol; j < StrideCol + 3; j++) {
                if (sudoku[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

}
