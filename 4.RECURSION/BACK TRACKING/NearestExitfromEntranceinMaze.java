public class NearestExitfromEntranceinMaze {
    public static void main(String[] args) {
        String[][] maze = {{"+",".","+","+","+","+","+"},{"+",".","+",".",".",".","+"},{"+",".","+",".","+",".","+"},{"+",".",".",".","+",".","+"},{"+","+","+","+","+",".","+"}};
        maze(maze, 0, 1,0);
    }
    static int min = Integer.MAX_VALUE;
    static void maze(String[][] maze, int r, int c, int path) {

        // System.out.println("h");
        if (maze[r][c] == "+") {
            return;
        }
        if ((r == maze.length - 1 || c == maze.length - 1 || r ==0 || c == 0) && path > 0) {
            System.out.println(path);
            // System.out.println(r + " "+c);
            return;
        }


        maze[r][c] = "+";
        if (r < maze.length - 1) {
            // System.out.println("r++");
            maze(maze, r + 1, c, path+1);
        }

        if (c < maze[0].length - 1) {
            // System.out.println("c++");
            maze(maze, r, c + 1, path +1);
        }

        if (r > 0) {
            // System.out.println("r--");
            maze(maze, r - 1, c, path + 1);
        }
        if (c > 0) {
            // System.out.println("c--");
            maze(maze, r, c - 1, path + 1);
        }

        maze[r][c] = ".";
    }
}
