import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bestSum {

    static Map<Integer , List<Integer>> map = new HashMap<>();
    static List<List<Integer>> ls = new ArrayList<>();
    static Map<Integer ,  List<List<Integer>>> posibilities = new HashMap<>();

    public static List<Integer> sum(int[] nums , int targetSum){
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        if(targetSum == 0){
            return new ArrayList<>();
        }

        if(targetSum < 0){
            return null;
        }




        List<Integer> small = null;

        for (int i : nums) {
            List<Integer> res = sum(nums, targetSum - i);

            if(res != null){
                res = new ArrayList<>(res);
                res.add(i);
                if(small == null || small.size() > res.size()){
                    small = res;
                }
            }

            if(posibilities.containsKey(targetSum)){
                List<List<Integer>> po = posibilities.get(targetSum);
                po.add(res);
                posibilities.put(targetSum, po);
            }else{
                List<List<Integer>> ls = new ArrayList<>();
                ls.add(res);
                posibilities.put(targetSum, ls);
            }


            
        }
        
        map.put(targetSum,small);

        return small;
    }


    public static void main(String[] args) {

        int[] sum = {1,9,5};
        System.out.println(sum(sum, 8));


        System.out.println(map);
        for(Integer i : posibilities.keySet()){
            System.out.println(i + " --> "+ posibilities.get(i));
        }
    }
}
