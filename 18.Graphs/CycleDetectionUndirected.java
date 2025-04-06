import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CycleDetectionUndirected {
    // Using BFS
    public static boolean isCyclic(int V, int[][] edges) {
        // Create adjacency list
        ArrayList<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>(); // Initialize each list
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[V];

        // Check all components in case of a disconnected graph
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCyclicDFS(i, adj, visited,-1)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time Complexity: O(N + 2E)
    // Space Complexity: O(V)

    public static boolean isCyclBfs(int start, ArrayList<Integer>[] adj, boolean[] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{start, -1});
        visited[start] = true;  // ✅ FIXED: Mark the correct node as visited

        while (!q.isEmpty()) {
            int[] pop = q.remove();
            int node = pop[0], parent = pop[1];

            for (int neighbor : adj[node]) {
                if (neighbor != parent) {
                    if (visited[neighbor]) {
                        return true; // Cycle detected
                    }
                    visited[neighbor] = true;
                    q.add(new int[]{neighbor, node});
                }
            }
        }
        return false;
    }

    // Using DFS
    // You are going deepth but you find a node that is already visited which is not the parent of the current node then it is a cycle
    // Time Complexity: O(N + 2E)
    // Space Complexity: O(V) + O(N) for recursion stack
    public static boolean isCyclicDFS(int start, ArrayList<Integer>[] adj, boolean[] visited, int parent) {
        visited[start] = true;

        for (int neighbor : adj[start]) {
            if (!visited[neighbor]) {
                if (isCyclicDFS(neighbor, adj, visited, start)) {
                    return true; // Cycle detected
                }
            } else if (neighbor != parent) {
                return true; // Cycle detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] edges1 = { // Not connected graph with cycle
            {0, 1}, {1, 2}, {2, 0}, {3, 4}
        };
        int[][] edges2 = { // Connected graph with cycle
            {0, 1}, {1, 2}, {2, 3}, {3, 0}
        };
        int[][] edges3 = { // Connected graph without cycle
            {0, 1}, {1, 2}, {2, 3}, {3, 4}
        };
        int[][] edges4 = { // Disconnected graph without cycle
            {0, 1}, {2, 3}, {4, 5}
        };

        System.out.println(isCyclic(5, edges1)); // Expected: true
        System.out.println(isCyclic(4, edges2)); // Expected: true
        System.out.println(isCyclic(5, edges3)); // Expected: false
        System.out.println(isCyclic(6, edges4)); // Expected: false
    }
}
