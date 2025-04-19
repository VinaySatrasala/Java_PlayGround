import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class LongestIncreasingPathinaMatrix {
    public int longestIncreasingPathDFS(int[][] matrix) {
        int max = 0;
        int[][] longest = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(longest[i][j] == 0){
                    int len = traversal(matrix, i, j, longest);
                    max = Math.max(max, len);
                }else{
                    max = Math.max(max, longest[i][j]);
                }
            }
        }
        for(int[] l : longest){
            Arrays.toString(l);
        }
        return max;
    }
    public int traversal(int[][] matrix,int row,int col,int[][] longest){
        if(longest[row][col] != 0){
            return longest[row][col];
        }

        // explore all 4 directons 
        int max = 1;
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
        for(int[] dir : directions){
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if(valid(newRow,newCol,matrix) && matrix[newRow][newCol] > matrix[row][col]){
                max = 1 +  Math.max(max, traversal(matrix, newRow, newCol, longest));
            }
        }
        return longest[row][col] = max;
    }
    
    
    
        
        public int longestIncreasingPath(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
            // 1.Count all indegrees 
            int[][] indegrees = new int[m][n];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    for(int[] dir : directions){
                        int newRow = i + dir[0];
                        int newCol = j + dir[1];
                        if(valid(newRow, newCol, matrix) && matrix[newRow][newCol] > matrix[i][j]){
                            indegrees[newRow][newCol]++;
                        }
                    }
                }
            }

            // 2.Intialize a queue<{x,y}> -> represets array index
            Queue<int[]> queue = new ArrayDeque<>();

            // 3. Add all elements with indegree = 0 means starting elements
            // why indegree =0 beacuse other then this elements what ever you take those are node in a path so how can you max with out startng at first
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(indegrees[i][j] == 0) queue.add(new int[]{i,j});
                }
            }

            // Now u added perform level order traversal
            // the path with longetst paths nodes will be in give 
            int level = 0;
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size-- > 0) {
                    int[] pop = queue.poll();
                    // mark all indegrees of neighbours of this element to -- beacuse find next starting node just like u found this
                    int row = pop[0];
                    int col = pop[1];
                    for(int[] dir : directions){
                        int newRow = row + dir[0];
                        int newCol = col + dir[1];
                        if(valid(newRow, newCol, indegrees) && matrix[newRow][newCol] > matrix[row][col]){
                            indegrees[newRow][newCol]--;
                            if(indegrees[newRow][newCol] == 0){
                                queue.add(new int[]{newRow,newCol});
                            }
                        }
                    }
                    
                }
                level++;
            }






            return level;
        }
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    private boolean valid(int newRow, int newCol, int[][] matrix) {
        return newRow >=0 && newCol >=0 && newRow < matrix.length && newCol < matrix[0].length;
    }
}
