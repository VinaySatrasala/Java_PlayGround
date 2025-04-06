import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberofWaystoArriveatDestination {
    public class  Pair {
        int time;
        int node;
        public Pair(int time,int node){
            this.time = time;
            this.node = node;
        }
    }
    public int countPaths(int n, int[][] roads) {
        
        // Construct adj list
        ArrayList<int[]>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] edge : roads){
            adj[edge[0]].add(new int[]{edge[1],edge[2]});
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.time - y.time);
        int[] t = new int[n];
        Arrays.fill(t, Integer.MAX_VALUE);
        pq.add(new Pair(0, 0));
        boolean reached = false;
        int count = 0;
        while (!pq.isEmpty()) {
            Pair pop = pq.poll();
            int time = pop.time;
            int node = pop.node;

            if(node == n-1){
                if(!reached){
                    reached = true;
                    count = 1;
                }else if(reached && time == t[n-1]) {
                    count++;
                }
                continue;
            }else{
                if(reached && time > t[n-1]){
                    continue;
                }
            }
            for(int[] it : adj[node]){
                int edgeWeight = it[1];
                int adjNode = it[0];
                if(t[adjNode] > time + edgeWeight){
                    t[adjNode] = time + edgeWeight;
                    pq.add(new Pair(t[adjNode], adjNode));
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
