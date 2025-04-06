import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfEnclaves {
    public int numEnclaves(int[][] grid) {
        // Rows 
        int n = grid.length;

        // Cols 
        int m = grid[0].length;

        // So basically other then 1 that have bordered like surrounded we can walk 
        // So canWalk = total_land - cannot_walk

        int[][] visited = new int[n][m];
        // findind Cannot_wall
        
        // First row and Last row
        for(int i=0;i<m;i++){
            if(grid[0][i] == 1){
                bfs(grid, 0, i, visited);
            }
            if(grid[n-1][i] == 1){
                bfs(grid, n-1, i, visited);
            }
        }

        // First col and Last Col
        for(int i=0;i<n;i++){
            if(grid[i][0] == 1){
                bfs(grid, i, 0, visited);
            }
            if(grid[i][m-1] == 1){
                bfs(grid, i, m-1, visited);
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] != -1 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        
        return count;   
    }
    public void dfs(int[][] grid,int row,int col,int[][] visited){
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0 || visited[row][col] == -1 || grid[row][col] == 0){
            return;
        }

        visited[row][col] = -1;

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] dir:directions){
            dfs(grid, row + dir[0], col + dir[1], visited);
        }
    }

    public void bfs(int[][] grid,int row,int col,int[][] visited){
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{row,col});
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        visited[row][col] = -1;
        while (!q.isEmpty()) {
            int[] pop = q.remove();
            // 4 directions
            for(int[] dir:directions){
                int newRow = pop[0] + dir[0];
                int newCol = pop[1] + dir[1];
                if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && visited[newRow][newCol] != -1 && grid[newRow][newCol] == 1){
                    visited[newRow][newCol] = -1;
                    q.add(new int[]{newRow,newCol});
                }
            }
        }
    }
    public static void main(String[] args) {
        NumberOfEnclaves obj = new NumberOfEnclaves();
        int[][] grid = {
            {0,0,0,0},
            {1,0,1,0},
            {0,1,1,0},
            {0,0,0,0}
        };
        int result = obj.numEnclaves(grid);
        System.out.println(result); // Output: 3
    }
}
