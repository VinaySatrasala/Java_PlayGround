// Nearest Zero -> leetcode 542
// Nearest One -> Geeks for Geeks

import java.util.ArrayDeque;
import java.util.Queue;

public class NearestZeroOrOne {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dist = new int[n][m];

        // 1. Add all the one index to queue and then traverse level wise => BFS
        Queue<int[]> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j,0});
                }
            }
        }

        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        boolean[][] visited = new boolean[n][m];
        while (!q.isEmpty()) {
            int[] pop = q.remove();
            int row = pop[0];
            int col = pop[1];
            int steps = pop[2];
            dist[row][col] = steps;
            for(int[] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && mat[newRow][newCol] != 0 && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true; // Mark the current node as visited
                    q.add(new int[]{newRow,newCol,steps+1});
                }
            }
        }

        return dist;
    }    
    public static void main(String[] args) {
        NearestZeroOrOne obj = new NearestZeroOrOne();
        int[][] mat = {
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };
        int[][] result = obj.updateMatrix(mat);
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
