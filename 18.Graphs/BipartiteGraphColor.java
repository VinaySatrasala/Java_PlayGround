import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class BipartiteGraphColor {
    public boolean isBipartite(int[][] graph) {
        int V = graph.length;
        int[] visited = new int[V];
        Arrays.fill(visited, -1);
        for(int i=0;i<V;i++){
            if(visited[i] == -1){
                if(!dfs(graph, i, visited,0)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, int node, int[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        visited[node] = 0;
    
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int neighbor : graph[curr]) {
                if (visited[neighbor] == -1) {
                    visited[neighbor] = visited[curr] ^ 1; // Flip color
                    q.add(neighbor);
                } else if (visited[neighbor] == visited[curr]) {
                    return false; // Conflict detected
                }
            }
        }
        return true;
    }

    public boolean dfs(int[][] graph,int node,int[] visited,int prev_color){
        if(visited[node] == prev_color){
            return false;
        }
        // Flipping 0 to 1 and 1 to 0
        if(visited[node] != -1){
            return true;
        }
        int color = prev_color ^ 1;
        visited[node] = color;
        for(int i : graph[node]){
            if(!dfs(graph, i, visited, color)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        BipartiteGraphColor bgc = new BipartiteGraphColor();
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(bgc.isBipartite(graph));
        int[][] graph2 = {{1,2,3},{0,2},{0,1,3},{0,2}};
        System.out.println(bgc.isBipartite(graph2));
    }
}

