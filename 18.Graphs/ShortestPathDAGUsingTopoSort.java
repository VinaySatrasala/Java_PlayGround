import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathDAGUsingTopoSort {
    public static int INF = Integer.MAX_VALUE;

    public void topoSort(ArrayList<int[]>[] adj,Stack<Integer> stack,boolean[] visited,int node){
        visited[node] = true;
        for(int[] n : adj[node]){
            if(!visited[n[0]]){
                topoSort(adj, stack, visited, n[0]);
            }
        }
        stack.add(node);
    }
    public int[] findShortestPath(int[][] edges,int start,int V){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        ArrayList<int[]>[] adj = new ArrayList[V];
        for(int i = 0;i<V;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            // u -> v with W
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj[u].add(new int[]{v,w});
        }
        // adjacency list is ready
        System.out.println("Adjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int[] n : adj[i]) {
                System.out.print("-> " + n[0] + "(" + n[1] + ") ");
            }
            System.out.println();
        }
        for(int node =0;node < V;node++){
            if(!visited[node]){
                topoSort(adj, stack, visited, node);
            }
        }

        // print the topological order
        System.out.println(stack);

        // now we have toposort
        // Give distance array
        int[] dist = new int[V];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            int d = dist[pop];
            if(d != INF){
                for(int[] n : adj[pop]){
                    dist[n[0]] = Math.min(dist[n[0]], d + n[1]);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        ShortestPathDAGUsingTopoSort sp = new ShortestPathDAGUsingTopoSort();
        // Give graph as edges with weights
        int[][] edges = {
                {0, 1, 2},
                {0, 2, 4},
                {1, 2, 1},
                {1, 3, 7},
                {2, 3, 3}
        };
        int n = 4; // Number of vertices
        int start = 0; // Starting vertex
        int[] shortestPath = sp.findShortestPath(edges, start, n);
        System.out.println("Shortest path from vertex " + start + ":");
        for (int i = 0; i < shortestPath.length; i++) {
            if (shortestPath[i] == INF) {
                System.out.println("Vertex " + i + ": INF");
            } else {
                System.out.println("Vertex " + i + ": " + shortestPath[i]);
            }
        }
        // Output:
        // Shortest path from vertex 0:
        // Vertex 0: 0
        // Vertex 1: 2
        // Vertex 2: 3
        // Vertex 3: 6
        // Explanation:
    }
}
