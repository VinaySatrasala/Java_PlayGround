import java.lang.reflect.Array;
import java.util.*;

public class p2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer , String> map = new HashMap<>();
        
        for(int i = 0;i<heights.length;i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int j = heights.length - 1;
        for(int i = 0;i<heights.length;i++){
            names[j] = map.get(heights[i]);
            j--;
        }
        return names;
    }
}
