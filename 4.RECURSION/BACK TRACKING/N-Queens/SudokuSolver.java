public class SudokuSolver {
    public static void main(String[] args) {
        char[][] sudoku = new char[9][9];
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                sudoku[i][j] = ' ';
            }
        }
        solver(sudoku, 0, 0);
    }
    static void solver(char[][] sudoku , int row ,int col){


        display(sudoku);
        if(row == 8 && col == 8){
            return;
        }
        if(col == 9){
            solver(sudoku, row + 1, 0);
        }

        if(sudoku[row][col] == ' '){
            for (char ch = '1'; ch <= '9'; ch +='1') {
                if(isSafe(sudoku,ch,row,col)){
                    sudoku[row][col] = ch;
                    solver(sudoku, row, col+1);
                    sudoku[row][col] = ' ';
                }
            }
        }



        
        solver(sudoku, row, col+1);
    }

    static boolean isSafe(char[][] sudoku, char ch,int row , int col) {
        // Row and Col
        for (int i = 0; i < sudoku.length &&( i != row || i != col); i++) {
            if(ch == sudoku[row][i]){
                return false;
            }
            if(ch == sudoku[i][col]){
                return false;
            }
        }


        // Stride
        int strideRow = (row/3)*3;
        int StrideCol = (col/3)*3;
        for (int i = strideRow; i < strideRow + 3; i++) {
            for (int j = StrideCol ; j < StrideCol + 3 ; j++) {
                if(sudoku[i][j] == ch){
                    return false;
                }
            }
        }


        return true;
    }
    static void display(char[][] sudoku) {
        for (char[] cs : sudoku) {
            for (char s : cs) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
