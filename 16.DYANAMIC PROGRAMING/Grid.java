import java.util.Arrays;

public class Grid{
    static int m = 45;
    static int n = 45;
    static int[][] grid = new int[m][n];
    public static int find(int sx , int sy,int ex , int ey){
        if(!isValid(sx, sy, ex, ey)){
            return 0;
        }
        if(grid[sx][sy] != - 1){
            return grid[sx][sy];
        }
        if(sx == ex && sy == ey){
            return 1;
        }

        grid[sx][sy] = find(sx + 1, sy, ex, ey) + find(sx, sy + 1, ex, ey);
        return grid[sx][sy];
    }
    public static boolean isValid(int sx , int sy,int ex , int ey){
        if(sx <= ex && sy <= ey){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        for(int[] i:grid){
            Arrays.fill(i, -1);
        }

        System.out.println(find(0, 0, 44, 44));
        for(int[] i:grid){
            System.out.println(Arrays.toString(i));
        }
    }
}