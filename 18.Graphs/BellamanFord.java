import java.util.Arrays;

public class BellamanFord{
    static int[] bellmanFord(int V, int[][] edges, int src) {
        // Write your code here
        int n = V;
        int INF = Integer.MAX_VALUE;
        int[] dist = new int[V];
        dist[src] = 0;
        Arrays.fill(dist,INF);
        while (n-- > 0) {
            // edgs : u,v,w : u -> v with w
            for(int[] edge : edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        
    }
}