import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class NumberOfDistanctIsland {
    public int countDistinctIslands(int[][] grid) {
        // Your Code here

        // same isaland proble + set(islands);
        // 1. Traverse the grid and find the island
        // 2. For each island, we need to normalize the island
        // 3. Add the island to the set
        // 4. Return the size of the set
        // 5. We need to use BFS or DFS to find the island
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Set<String> set = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    set.add(islandBfs(grid,i,j,visited));
                }
            }
        }
        System.out.println(set);
        // Print the islands
        return set.size();
    }
    public String islandBfs(int[][] grid,int row,int col,boolean[][] visited){
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        int baseX = row;
        int baseY = col;
        Queue<int[]> q = new ArrayDeque<>();
        
        q.add(new int[]{row,col});
        StringBuilder res = new StringBuilder();
        
        
        visited[row][col] = true;

        while (!q.isEmpty()) {
            // print
            int[] pop = q.remove(); 

            res.append((pop[0] - baseX) + "," + (pop[1] - baseY) + " ");

            // 4 directions
            for(int[] dir : directions){
                int newRow = pop[0] + dir[0];
                int newCol = pop[1] + dir[1];
                if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length && !visited[newRow][newCol] && grid[newRow][newCol] == 1){
                    visited[newRow][newCol] = true;
                    q.add(new int[]{newRow,newCol});
                }
            }
        }
        return res.toString().trim();
    }
    public String islandDfs(int[][] grid, int row, int col, boolean[][] visited, int baseX, int baseY) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || visited[row][col] || grid[row][col] == 0)
            return "";
    
        visited[row][col] = true;
        StringBuilder res = new StringBuilder();
        res.append((row - baseX) + "," + (col - baseY) + " ");
    
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] dir : directions) {
            res.append(islandDfs(grid, row + dir[0], col + dir[1], visited, baseX, baseY));
        }
        return res.toString();
    }
    

    public static void main(String[] args) {
        NumberOfDistanctIsland obj = new NumberOfDistanctIsland();
        int[][] grid = {
            {1,1,0,0,0},
            {1,1,0,0,0},
            {0,0,0,1,1},
            {0,0,0,1,1},
        };
        int result = obj.countDistinctIslands(grid);
        System.out.println(result); // Output: 3
    }
}
