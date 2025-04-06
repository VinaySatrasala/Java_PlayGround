import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        
        // Corrected loop (m = rows, n = columns)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If no fresh oranges, return 0 immediately
        if (fresh == 0) return 0;

        // Level order BFS
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;  // Track if at least one orange rots in this step
            
            while (size > 0) {
                int[] pop = q.poll();
                int x = pop[0];
                int y = pop[1];

                // Check all 4 directions
                if (x + 1 < m && grid[x + 1][y] == 1) {
                    q.add(new int[]{x + 1, y});
                    grid[x + 1][y] = 2;
                    fresh--;
                    rotted = true;
                }
                if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                    q.add(new int[]{x - 1, y});
                    grid[x - 1][y] = 2;
                    fresh--;
                    rotted = true;
                }
                if (y + 1 < n && grid[x][y + 1] == 1) {
                    q.add(new int[]{x, y + 1});
                    grid[x][y + 1] = 2;
                    fresh--;
                    rotted = true;
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                    q.add(new int[]{x, y - 1});
                    grid[x][y - 1] = 2;
                    fresh--;
                    rotted = true;
                }

                size--;
            }

            // Only increase count if at least one orange rotted this round
            if (rotted) count++;
        }

        // If there are still fresh oranges, return -1, else return count
        return fresh == 0 ? count : -1;
    }
}
