import java.util.List;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},
            {3},
            {3},
            {}
        };
        TopologicalSort ts = new TopologicalSort();
        Stack<Integer> sortedStack = ts.sort(graph);
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    } 
    public Stack<Integer> sort(int[][] graph){
        Stack<Integer> stack = new Stack<>();
        int V = graph.length;
        boolean[] visited = new boolean[V];
        for(int node = 0;node < V;node++){
            if(!visited[node]){
                visited[node] = true;
                dfs(graph,visited,stack,node);
            }
        }
        return stack;
    }
    private void dfs(int[][] graph, boolean[] visited, Stack<Integer> stack, int node) {
       for(int n : graph[node]){
        if(!visited[n]){
            visited[n] = true;
            dfs(graph, visited, stack, n);
        }
       }
       stack.add(node);
    }   
}
