import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class ShortestPathInUndirectedGraph {
    private static int INF = Integer.MAX_VALUE;
    private static int[] findShortestPath(int[][] edges, int start, int V) {

        // Create Adj list
        ArrayList<Integer>[] adj = new ArrayList[V];

        for(int i=0;i<V;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
        }


        // BFS
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{start,0});

        int[] dist = new int[V]; 
        Arrays.fill(dist,INF);
        dist[start] = 0;
        while (!q.isEmpty()) {
            int[] pop = q.remove();
            for(int n : adj[pop[0]]){
                dist[n] = Math.min(dist[n], 1 + pop[1]);
            }
        }
        return dist;
    }
    
    public static void main(String[] args) {
        // given an undirected graph with out weights
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 2},
                {1, 3},
                {2, 3},
                {3, 4}
        };
        int n = 5; // Number of vertices
        int start = 0; // Starting vertex
        int[] shortestPath = findShortestPath(edges, start, n);

    }
}
