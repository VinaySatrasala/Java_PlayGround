import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer , Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(int[] i : matches){
            if(!map.containsKey(i[0])){
                map.put(i[0], 0);
            }

            if(map.containsKey(i[1])){
                map.put(i[1], map.get(i[1]) + 1);
            }else{
                map.put(i[1], 1);
            }
        }
        for(Integer i : map.keySet()){
            if(map.get(i) == 0){
                zero.add(i);
            }

            if(map.get(i) == 1){
                one.add(i);
            }



        }

        list.add(zero);
        list.add(one);

        return list;
        
    }
}
