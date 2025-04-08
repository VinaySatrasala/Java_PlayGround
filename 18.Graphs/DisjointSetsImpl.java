import java.util.Arrays;

class DisJointSets{
    int[] rank;
    int[] size;
    int[] parent;

    public DisJointSets(int n){
        rank = new int[n];
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


    public void UnionByRank(int u,int v){
        int ulp_u = findUltimateParent(u);
        int ulp_v = findUltimateParent(v);

        // Beacuse : already attached
        if(ulp_u == ulp_v) return;

        if(rank[ulp_u] > rank[ulp_v]){
            parent[ulp_v] = ulp_u;
        }else if(rank[ulp_u] < rank[ulp_v]){
            parent[ulp_u] = ulp_v;
        }else{
            parent[ulp_v] = ulp_u;
            rank[ulp_u]++;
        }
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
public class DisjointSetsImpl {
    
}
