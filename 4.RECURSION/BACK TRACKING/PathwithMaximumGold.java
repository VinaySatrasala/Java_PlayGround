public class PathwithMaximumGold {
    public static void main(String[] args) {
        int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(getMaximumGold(grid));
    }

    static int Path = 0;
    static int getMaximumGold(int[][] grid) {
        boolean[][] board = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j] != 0){
                    path(grid, board, i, j, 0);
                }
            }
        }
        return Path;
    }


    static void path(int[][] grid, boolean[][] board, int row, int col, int path) {

        if (board[row][col]) {
            return;
        }

        board[row][col] = true;
        if (furthur(grid, board, row, col)) {
            if (row < grid[0].length - 1) {
                if (grid[row + 1][col] != 0) {
                    path(grid, board, row + 1, col, path + grid[row][col]);
                }
            }
            if (col < grid.length - 1) {
                if (grid[row][col + 1] != 0) {
                    path(grid, board, row, col + 1, path + grid[row][col]);
                }
            }
            if (row > 0) {
                if (grid[row - 1][col] != 0) {
                    path(grid, board, row - 1, col, path + grid[row][col]);
                }
            }
            if (col > 0) {
                if (grid[row][col - 1] != 0) {
                    path(grid, board, row, col - 1, path + grid[row][col]);
                }
            }
        } else {
            Path = Math.max(path, Path);
            return;
        }

        board[row][col] = false;
    }

    static boolean furthur(int[][] grid, boolean[][] board, int row, int col) {
        if (row < grid[0].length - 1) {
            if (grid[row + 1][col] != 0) {
                return true;
            }
        }
        if (col < grid.length - 1) {
            if (grid[row][col + 1] != 0) {
                return true;
            }
        }
        if (row > 0) {
            if (grid[row - 1][col] != 0) {
                return true;
            }
        }
        if (col > 0) {
            if (grid[row][col - 1] != 0) {
                return true;
            }
        }
        return false;
    }

}
