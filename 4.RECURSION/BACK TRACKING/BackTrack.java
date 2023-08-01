import java.util.Arrays;

public class BackTrack {
    public static void main(String[] args) {
        boolean[][] maze = { { true, true, true },
                { true, true, true },
                { true, true, true } };

        int[][] pat = new int[3][3];

        mazePrint(maze, 0, 0, "", pat, 1);
    }

    static void maze(boolean[][] maze, int r, int c, String path) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(path);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        if (r < maze.length - 1) {
            maze(maze, r + 1, c, path + "D");
        }

        if (c < maze[0].length - 1) {
            maze(maze, r, c + 1, path + "R");
        }

        if (r > 0) {
            maze(maze, r - 1, c, path + "U");
        }
        if (c > 0) {
            maze(maze, r, c - 1, path + "L");
        }

        maze[r][c] = true;
    }

    static void mazePrint(boolean[][] maze, int r, int c, String path, int[][] pat, int steps) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            pat[r][c] = steps;
            System.out.println(path);
            for (int[] is : pat) {
                System.out.println(Arrays.toString(is));
            }
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        pat[r][c] = steps;

        maze[r][c] = false;
        if (r < maze.length - 1) {
            mazePrint(maze, r + 1, c, path + "D", pat, steps + 1);
        }

        if (c < maze[0].length - 1) {
            mazePrint(maze, r, c + 1, path + "R", pat, steps + 1);
        }

        if (r > 0) {
            mazePrint(maze, r - 1, c, path + "U", pat, steps + 1);
        }
        if (c > 0) {
            mazePrint(maze, r, c - 1, path + "L", pat, steps + 1);
        }

        maze[r][c] = true;
        pat[r][c] = 0;

    }
}
