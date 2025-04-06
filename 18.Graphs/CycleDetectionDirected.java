public class CycleDetectionDirected {
    public static void main(String[] args) {
        // Directed Graph
        int[][] graph = {
            {1},        // 0 → 1
            {2, 4},     // 1 → 2, 1 → 4
            {3, 5},     // 2 → 3, 2 → 5
            {6},        // 3 → 6
            {5, 6},     // 4 → 5, 4 → 6
            {6},        // 5 → 6
            {0, 2, 3}   // 6 → 0 (cycle), 6 → 2 (cycle), 6 → 3 (cycle)
        };
        
        CycleDetectionDirected obj = new CycleDetectionDirected();
        System.out.println("Graph has cycle: " + obj.isCyclic(graph)); // Expected output: true
    }

    private boolean isCyclic(int[][] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V]; // Track nodes in the current DFS path

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(graph, visited, pathVisited, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int[][] graph, boolean[] visited, boolean[] pathVisited, int node) {
        System.out.println("DFS visiting node: " + node);
        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {  // If not visited, go deeper
                if (dfs(graph, visited, pathVisited, neighbor)) {
                    return true; // If cycle found, return immediately
                }
            } else if (pathVisited[neighbor]) { 
                // If neighbor is in the current recursion path, cycle exists
                return true;
            }
        }

        pathVisited[node] = false; // Backtrack
        return false;
    }
}
