public class Maze2withObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true,false,true},
                            {true,true,true}};

        maze(maze, 0, 0, "");
    }

    static void maze(boolean[][] maze,int r,int c,String path){
        if(!maze[r][c]){
            return;
        }

        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(path);
            return;
        }

        if(r < maze.length-1){
            maze(maze, r+1, c, path+"D");
        }

        if(c < maze[0].length - 1){
            maze(maze, r, c+1, path+"R");
        }
    }
}
