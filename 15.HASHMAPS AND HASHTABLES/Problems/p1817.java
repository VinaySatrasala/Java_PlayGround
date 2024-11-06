import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p1817{
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer , Set<Integer>> map = new HashMap<>();

        for(int[] i : logs){
            Set<Integer> set = map.getOrDefault(i[0], new HashSet<>());
            set.add(i[1]);

            map.put(i[0], set);
        }

        int[] ans = new int[k];
        for(Set<Integer> set : map.values()){
            ans[set.size()-1]++;
        }


        return ans;
    }
    public static void main(String[] args) {
        
    }
}