import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2352 {
    public static int equalPairs(int[][] grid) {
        Map<Integer , Integer> map = new HashMap<>(); 
        int count = 0;
        int n = grid.length;


        for(int i=0;i<n;i++){
            List<Integer> col = new ArrayList<>();
            for(int j = 0;j<n;j++){
                if(i == 0){
                    int res = hash(grid[j]);

                    map.put(res,map.getOrDefault(res,0) + 1);
                }
                col.add(grid[j][i]);
            }
            int res = hash(col);
            count += map.getOrDefault(res, 0);
        }
        return count;
    }
    public static int hash(int[] arr){
        String s = "";
        for(int i : arr){

            s = s+ i;
        }
        return s.hashCode();
    }

    public static int hash(List<Integer> list){
        String s = "";
        for(int i = 0;i<list.size();i++){
            s = s + list.get(i);
        }

        return s.hashCode();
    }


    public static void main(String[] args) {
        int[][] arr = {
        {8,8,8,8,8,8,10,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,19,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,6,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,6,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,4,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,14,8,8,8,8,8,8,8,8},
        {6,6,6,6,6,6,7,6,6,6,6,6,6,6,6},
        {8,8,8,8,8,8,17,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,16,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,19,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,6,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,16,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,10,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,19,8,8,8,8,8,8,8,8},
        {8,8,8,8,8,8,4,8,8,8,8,8,8,8,8}};
        
        
        System.out.println(equalPairs(arr));
    }



    
}
