import java.util.Arrays;

class DisJointSets{
    int[] size;
    int[] parent;

    public DisJointSets(int n){
        parent = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        for(int i = 0;i<n;i++){
            parent[i] = i;
        }
    }

    // Finds and path compression
    public int findUltimateParent(int node){
        if(parent[node] != node){
            parent[node] = findUltimateParent(parent[node]);
        }
        return parent[node];
    }
    public void UnionBySize(int u,int v){
        int ulp_u = findUltimateParent(u);
        int ulp_v = findUltimateParent(v);

        // Beacuse : already attached
        if(ulp_u == ulp_v) return;
        if(size[ulp_u] > size[ulp_v]){
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }else if(size[ulp_u] < size[ulp_v]){
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u];
        }else{
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
        // else if can be merged since makes the same
    }
}

public class Kruskals {
    public int findMst(int[][] edges,int n){
        Arrays.sort(edges,(x,y) -> x[2] - y[2]);
        DisJointSets dj = new DisJointSets(n);
        int sum = 0;
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if(dj.findUltimateParent(u) != dj.findUltimateParent(v)){
                sum = sum + w;
                dj.UnionBySize(u,v);
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Kruskals k = new Kruskals();
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };
        int n = 4; // 4 nodes
        System.out.println("MST Cost = " + k.findMst(edges, n)); // Output should be 19
    }
    
}
