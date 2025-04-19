import java.util.Arrays;

public class RedundentConnection {
    class DJU{
        int[] size;
        int[] parent;
        public DJU(int n){
            size = new int[n];
            parent = new int[n];
            for(int i=0;i<n;i++){
                size[i] = 1;
                parent[i] = i;
            }
        }
        public int findUlp(int x){
            if(parent[x] != x){
                parent[x] = findUlp(parent[x]);
            }
            return parent[x];
        }

        public boolean union(int u,int v){
            int ulp_u = findUlp(u);
            int ulp_v = findUlp(v);
            if(ulp_u == ulp_v) return false;

            if(size[ulp_u] > size[ulp_v]){
                size[ulp_u] += size[ulp_v];
                parent[ulp_v] = parent[ulp_u];
            }else{
                size[ulp_v] += size[ulp_u];
                parent[ulp_u] = parent[ulp_v];
            }
            return true;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        DJU dju = new DJU(1000+1);
        int[] last = null;
        for(int[] edge : edges){
            if(!dju.union(edge[0],edge[1])){
                last = edge;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        RedundentConnection obj = new RedundentConnection();
        int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        System.out.println(Arrays.toString(obj.findRedundantConnection(edges)));
    }
}
