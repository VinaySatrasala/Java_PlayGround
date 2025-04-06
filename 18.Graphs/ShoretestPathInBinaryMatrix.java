import java.util.Arrays;
import java.util.PriorityQueue;

public class ShoretestPathInBinaryMatrix {
    public class Pair {
        int row;
        int col;
        int distance;
        public Pair(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
        public Pair() {}
        
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){
            return -1;
        }
        int n = grid.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        pq.add(new Pair(0,0,1));
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};

        int[][] dist = new int[n][n];
        for(int[] d : dist){
            Arrays.fill(d, Integer.MAX_VALUE);
        }
        while (!pq.isEmpty()) {
            Pair pop = pq.poll();
            int row = pop.row;
            int col = pop.col;
            int distance = pop.distance;

            for(int[] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow >= 0 && newRow < n && newCol >=0 && newCol < n && grid[newRow][newCol] == 0){
                    if(dist[newRow][newCol] > distance + 1){
                        dist[newRow][newCol] = distance + 1;
                        pq.add(new Pair(newRow,newCol,distance + 1));
                    }
                    
                }
            }   
        }


        if(dist[n-1][n-1] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[n-1][n-1];
    }
}
