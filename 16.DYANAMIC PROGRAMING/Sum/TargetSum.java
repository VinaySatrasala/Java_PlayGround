import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    static Map<Integer , Boolean> map = new HashMap<>();
    public static boolean sum(int[] nums ,int TargetSum){

        if(map.containsKey(TargetSum)){
            return map.get(TargetSum);
        }
        if(TargetSum == 0){
            return true;
        }


        if(TargetSum < 0){
            return false;
        }
        for(int i : nums){
            boolean res = sum(nums, TargetSum - i);
            if(res){
                map.put(TargetSum, res);
                return true;
            }
        }
        map.put(TargetSum, false);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {7 , 14};


        System.out.println(sum(nums, 300));
        System.out.println(map);
    }
}
