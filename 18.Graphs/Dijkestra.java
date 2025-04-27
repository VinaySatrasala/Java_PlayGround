import java.util.*;

public class Dijkestra {
    public int shortest(List<List<int[]>> graph, int src, int dest) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        int INF = Integer.MAX_VALUE;
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;
        pq.add(new int[]{src, 0});
        while (!pq.isEmpty()) {
            int[] pop = pq.poll();
            int node = pop[0];
            int distance = pop[1];
            if (node == dest) return distance;
            for (int[] nei : graph.get(node)) {
                int adjNode = nei[0];
                int weight = nei[1];
                if (dist[adjNode] > distance + weight) {
                    dist[adjNode] = distance + weight;
                    pq.add(new int[]{adjNode, dist[adjNode]});
                }
            }
        }
        return -1; // or INF if unreachable
    }
}
