import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

class iPair {
    int first, second;

    iPair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Dijektras {

    public static void main(String[] args) {
        // undirected graph with weights
        // int[][] edges = {
        // {0, 1, 4},
        // {0, 2, 1},
        // {1, 2, 2},
        // {1, 3, 5},
        // {2, 3, 8},
        // {3, 4, 3}
        // };
        // int n = 5; // Number of vertices
        // int start = 0; // Starting vertex
        // int[] shortestPath = findShortestPath(edges, start, n);
        // for (int i = 0; i < shortestPath.length; i++) {
        // System.out.println("Shortest path from " + start + " to " + i + " is: " +
        // shortestPath[i]);
        // }
    }

    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        int V = adj.size();
        ArrayList<Integer> dist = new ArrayList<>();

        // Initialize distances to infinity
        for (int i = 0; i < V; i++) {
            dist.add(Integer.MAX_VALUE);
        }

        // Distance to source is 0
        dist.set(src, 0);

        PriorityQueue<iPair> pq = new PriorityQueue<>((x, y) -> x.first - y.first);
        pq.add(new iPair(0, src));

        while (!pq.isEmpty()) {
            int dis = pq.peek().first;
            int node = pq.peek().second;
            pq.poll();

            for (iPair pair : adj.get(node)) {
                int adjNode = pair.first;
                int edgeWeight = pair.second;

                if (dist.get(adjNode) > dis + edgeWeight) {
                    dist.set(adjNode, dis + edgeWeight);
                    pq.add(new iPair(dist.get(adjNode), adjNode));
                }
            }
        }
        return dist;
    }

    ArrayList<Integer> dijkstraWithSet(ArrayList<ArrayList<iPair>> adj, int src) {
        int V = adj.size();
        ArrayList<Integer> dist = new ArrayList<>();
        for (int i = 0; i < V; i++)
            dist.add(Integer.MAX_VALUE);
        dist.set(src, 0);

        TreeSet<iPair> set = new TreeSet<>();
        set.add(new iPair(0, src));

        while (!set.isEmpty()) {
            iPair top = set.pollFirst(); // smallest dist node
            int u = top.second;

            for (iPair pair : adj.get(u)) {
                int v = pair.second;
                int wt = pair.first;

                if (dist.get(v) > dist.get(u) + wt) {
                    // Remove old pair if it exists
                    if (dist.get(v) != Integer.MAX_VALUE)
                        set.remove(new iPair(dist.get(v), v));

                    dist.set(v, dist.get(u) + wt);
                    set.add(new iPair(dist.get(v), v));
                }
            }
        }

        return dist;
    }
    public List<Integer> shortestPath(int n,int m,int[][] edges){
        ArrayList<iPair>[] adj = new ArrayList[n + 1];

        for(int i=0;i<=n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            // u v w
            // u -> v with w
            adj[edge[0]].add(new iPair(edge[1],edge[2]));
        }

        PriorityQueue<iPair> pq = new PriorityQueue<>((x,y) -> x.first - y.first);

        int[] dist = new int[n + 1];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);
        int[] parent = new int[n + 1];
        dist[1] = 0;
        parent[1] = 1;
        pq.add(new iPair(0, 1));


        while (!pq.isEmpty()) {
            iPair top = pq.poll();
            int dis = top.first;
            int node = top.second;


            for(iPair pair : adj[node]){
                int adjNode = pair.first;
                int edgeWeight = pair.second;

                if(dist[adjNode] > dis + edgeWeight){
                    dist[adjNode] = dis + edgeWeight;
                    parent[adjNode] = node;
                    pq.add(new iPair(dist[adjNode], adjNode));
                }
            }
        }

        List<Integer> path = new ArrayList<>();
        if(dist[n] == INF){
            path.add(-1);
            return path;
        }
        int node = n;
        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(node);

        Collections.reverse(path);
        return path;
    }

}
