public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1} , {1,5,1} , {4,2,1}};
        System.out.println(minPathSum(grid));  
    }
    public static int v = Integer.MAX_VALUE;
    public static int minPathSum(int[][] grid) {
        help(grid, 0, 0, 0);
        return v;
    }
    public static void help(int[][] grid,int sum,int r,int c){
        if(!isValid(r, c, grid)){
            return;
        }
        if(r == grid.length -1 && c == grid[0].length - 1){
            sum += grid[r][c];
            v = Math.min(sum,v);
            return;
        }

        if(r < grid.length){
            help(grid, sum + grid[r][c], r + 1, c);
        }
        if(c < grid[0].length){
            help(grid, sum + grid[r][c], r, c + 1);
        }
    }
    private static boolean isValid(int r, int c,int[][] grid) {
        if(r < grid.length && c < grid[0].length){
            return true;
        }
        return false;
    }
}
