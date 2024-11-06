public class SudokuSolver1 {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };


        if(solver(sudoku)){
            display(sudoku);
        }

    }

    static boolean solver(int[][] sudoku) {
        int n = sudoku.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sudoku[i][j] == 0) {
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

        for (int num = 1; num <= 9; num++) {
            if (isSafe(sudoku, num, row, col)) {
                sudoku[row][col] = num;
                if (solver(sudoku)) {
                    return true;
                } else {
                    sudoku[row][col] = 0;
                }
            }
        }

        return false;

    }

    static boolean isSafe(int[][] sudoku, int ch, int row, int col) {
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

    static void display(int[][] sudoku) {
        for (int[] cs : sudoku) {
            for (int s : cs) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
