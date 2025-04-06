import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public void traversal(int i,int j,char[][] grid,boolean[][] visited){
        if(i < 0 || j < 0){
            return;
        }
        if(i >= grid.length || j >= grid[i].length){
            return;
        }
        if(visited[i][j]){
            return;
        }
        if(grid[i][j] == '0'){
            return;
        }
        visited[i][j] = true;

        traversal(i+1,j,grid,visited);
        traversal(i,j+1,grid,visited);

        traversal(i-1,j,grid,visited);
        traversal(i,j-1,grid,visited);

        traversal(i+1,j+1,grid,visited);
        traversal(i-1,j-1,grid,visited);

        traversal(i-1,j+1,grid,visited);
        traversal(i+1,j-1,grid,visited);
        
    }
    public static void main(String[] args) {
        NumberOfIslands obj = new NumberOfIslands();
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    NumberOfIslands.bfs(i, j,grid,visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    static void bfs(int row,int col,char[][] grid,boolean[][] visited){

        visited[row][col] = true;

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{row,col});

        while (!queue.isEmpty()) {
            int[] ret = queue.remove();
            int i = ret[0];
            int j = ret[1];
            if(check(i+1, j, grid) && grid[i+1][j] == '1' && !visited[i+1][j]){
                visited[i+1][j] = true;
                queue.add(new int[]{i+1,j});
            }
            if(check(i-1, j, grid) && grid[i-1][j] == '1' && !visited[i-1][j]){
                visited[i-1][j] = true;
                queue.add(new int[]{i-1,j});
            }
            if(check(i, j+1, grid) && grid[i][j+1] == '1' && !visited[i][j+1]){
                visited[i][j+1] = true;
                queue.add(new int[]{i,j+1});
            }
            if(check(i, j-1, grid) && grid[i][j-1] == '1' && !visited[i][j-1]){
                visited[i][j-1] = true;
                queue.add(new int[]{i,j-1});
            }

        }
    }
    static boolean check(int i,int j,char[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return false;
        }
        return true;
    }


}
