public class SurroundedRegions {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] visited = new int[n][];

        // traverse first row and last row
        for(int i=0;i<m;i++){
            // Row 0
            if(board[0][i] == 'O'){
                dfs(board,0,i,visited);
            }
            // Row n-1
            if(board[n-1][i] == 'O'){
                dfs(board, n-1, i, visited);
            }
        }

        // traverse first col and last col
        for(int i=0;i<n;i++){
            // Col 0
            if(board[i][0] == 'O'){
                dfs(board,i,0,visited);
            }
            // Row n-1
            if(board[i][m-1] == 'O'){
                dfs(board,i, m-1, visited);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] != -1 && board[i][j] != 'X'){
                    board[i][j] = 'X';
                }
            }
        }
    }
    public void dfs(char[][] board,int row, int col, int[][] visited){
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0 || board[row][col] == 'X' || visited[row][col] == -1){
            return;
        }
        visited[row][col] = -1;
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] dir:directions){
            dfs(board, row+dir[0], col+dir[1], visited);
        }
    }

    public static void main(String[] args) {
        SurroundedRegions obj = new SurroundedRegions();
        char[][] board = {
                            {'X','O','X','O','X','O'},
                            {'O','X','O','X','O','X'},
                            {'X','O','X','O','X','O'},
                            {'O','X','O','X','O','X'}
                        };
        obj.solve(board);
        for (char[] row : board) {
            for (char val : row) {
                System.out.print(val + ' ');
            }
            System.out.println();
        }
    }
}
